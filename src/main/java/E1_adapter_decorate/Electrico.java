package E1_adapter_decorate;

public class Electrico {
    private boolean encendido;
    private int aceleracion;

    public void conectarYactivar(){
        encendido = true;
    }

    public void moverMasRapido(){
        aceleracion++;
    }

    public void detener(){
        aceleracion = 0;
    }

    public void desconectar(){
        encendido = false;
    }

}
