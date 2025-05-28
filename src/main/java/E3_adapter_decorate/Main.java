package E3_adapter_decorate;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\retur\\OneDrive\\Escritorio\\UNRN\\TERCER AÑO\\PRIMER CUATRIMESTRE\\OBJETOS 2\\ArchivosJava\\Exports.txt";
        File file = new File(ruta);

        Exportador exportador = new ExportadorArchivo("Mensaje del archivo");
        Exportador exportadorConValidaciones = new ExportConValidaciones(exportador);

        Report reporte = new Report("Hola", exportadorConValidaciones);

        reporte.export(file);

    }
}
