package E4_adapter_decorate;

public class Especial implements Combo{
    private String descripcion;
    private double precio;

    @Override
    public String descripcion() {
        return "Combo Especial (Hamburguesa Premium + Papas medianas + Gaseosa + Helado)";    }

    @Override
    public double precio() {
        return 18;
    }
}
