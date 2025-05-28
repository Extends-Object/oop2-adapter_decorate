package E4_adapter_decorate;

public class Basico implements Combo{

    @Override
    public String descripcion() {
        return "Combo Básico (Hamburguesa + Papas chicas + Gaseosa)";
    }

    @Override
    public double precio() {
        return 10;
    }
}
