package E4_adapter_decorate;

public class Queso extends Decorador{
    public Queso(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Extra de queso";
    }

    @Override
    public double precio() {
        return combo.precio() + 0.50;
    }
}
