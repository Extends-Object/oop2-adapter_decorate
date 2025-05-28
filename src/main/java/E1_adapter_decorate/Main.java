package E1_adapter_decorate;

public class Main {
    public static void main(String[] args) {

        TipoMotor comun = new Comun();
        TipoMotor economico = new Economico();
        TipoMotor electrico = new AdaptadorElectrico(new Electrico());

        System.out.println("Usando motor común:");
        comun.arrancar();
        comun.acelerar();
        comun.apagar();

        System.out.println("\nUsando motor económico:");
        economico.arrancar();
        economico.acelerar();
        economico.apagar();

        System.out.println("\nUsando motor eléctrico:");
        electrico.arrancar();
        electrico.acelerar();
        electrico.apagar();
    }
}
