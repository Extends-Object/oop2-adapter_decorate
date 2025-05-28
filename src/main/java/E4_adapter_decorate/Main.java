package E4_adapter_decorate;

public class Main {
    public static void main(String[] args) {

        System.out.println("PEDIDO 1");
        Combo pedido1 = ComboBuilder.crear()
                .comboBasico()
                .conCarne()
                .conQueso()
                .build();
        mostrarPedido(pedido1, 1);


        System.out.println("\nPEDIDO 2");
        Combo pedido2 = ComboBuilder.crear()
                .comboFamiliar()
                .conTomate()
                .conPapas()
                .conQueso()
                .build();
        mostrarPedido(pedido2, 2);


        System.out.println("\nPEDIDO 3");
        Combo pedido3 = ComboBuilder.crear()
                .comboEspecial()
                .conCarne()
                .conCarne() // Doble carne
                .conQueso()
                .conTomate()
                .build();
        mostrarPedido(pedido3, 3);


        System.out.println("\nPEDIDO 4 (Sin Builder)");
        Combo pedido4 = new Queso(new Carne(new Basico()));
        mostrarPedido(pedido4, 4);


        //Total de pedidos
        double total = pedido1.precio() + pedido2.precio() +
                pedido3.precio() + pedido4.precio();
        System.out.println("Total de todos los pedidos: $" + String.format("%.2f", total));
    }

    private static void mostrarPedido(Combo combo, int numeroPedido) {
        System.out.println("Pedido #" + numeroPedido);
        System.out.println("Descripción: " + combo.descripcion());
        System.out.println("Precio Total: $" + String.format("%.2f", combo.precio()));
    }
}
