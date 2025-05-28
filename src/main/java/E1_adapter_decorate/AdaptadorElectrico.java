package E1_adapter_decorate;

public class AdaptadorElectrico extends TipoMotor {

    private Electrico motorElectrico;

    public AdaptadorElectrico(Electrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void arrancar() {
        System.out.println("\nConectando y arrancando...");
        this.motorElectrico.conectarYactivar();
    }

    @Override
    public void acelerar() {
        System.out.println("\nYendo mas rapido...");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("\nDeteniendo y desconectando...");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
