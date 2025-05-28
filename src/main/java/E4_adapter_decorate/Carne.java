package E4_adapter_decorate;

public class Carne extends Decorador{
    public Carne(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Extra de carne";
    }

    @Override
    public double precio() {
        return combo.precio() + 4.50;
    }
}
