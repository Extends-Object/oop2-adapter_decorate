package E4_adapter_decorate;

public abstract class Decorador implements Combo{

    protected Combo combo;

    public Decorador(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return this.combo.descripcion();
    }

    @Override
    public double precio() {
        return this.combo.precio();
    }
}
