package E1_adapter_decorate;

public class Comun extends TipoMotor {


    @Override
    public void arrancar() {
        System.out.println("\nArrancando...");
        encendido = true;
    }

    @Override
    public void acelerar() {
        System.out.println("\nAcelerando...");
        aceleracion++;
    }

    @Override
    public void apagar() {
        System.out.println("\nApagando...");
        encendido = false;
    }
}
