package E1_adapter_decorate;

public abstract class TipoMotor {

    protected boolean encendido;
    protected int aceleracion;

    public TipoMotor() {
        this.encendido = false;
        this.aceleracion = 0;
    }

    public abstract void arrancar();

    public abstract void acelerar();

    public abstract void apagar();
}
