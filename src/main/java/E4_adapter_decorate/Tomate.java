package E4_adapter_decorate;

public class Tomate extends Decorador{
    public Tomate(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Extra de tomate";
    }

    @Override
    public double precio() {
        return combo.precio() + 3.15;
    }
}
