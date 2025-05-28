package E4_adapter_decorate;

public class Familiar implements Combo{
    private String descripcion;
    private double precio;

    @Override
    public String descripcion() {
        return "Combo Familiar (2 Hamburguesas + Papas grandes + 2 Gaseosas)";
    }

    @Override
    public double precio() {
        return 14;
    }
}
