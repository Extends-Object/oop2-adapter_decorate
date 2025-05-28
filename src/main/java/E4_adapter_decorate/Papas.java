package E4_adapter_decorate;

public class Papas extends Decorador{
    public Papas(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Extra de papas";
    }

    @Override
    public double precio() {
        return combo.precio() + 2.80;
    }
}
