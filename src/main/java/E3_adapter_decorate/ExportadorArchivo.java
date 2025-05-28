package E3_adapter_decorate;

import java.io.*;

public class ExportadorArchivo implements Exportador{

    //Es la funcionalidad básica (escribir un archivo) no tiene validaciones: hace lo mínimo necesario
    //Es el COMPONENTE BASE ---> Es lo que se va a decorar

    private String contenido;

    public ExportadorArchivo(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void exportar(File file) {

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(file, false));  //false (sobrescribir) // true (append)
            salida.println(this.contenido);
            salida.close();
            System.out.println("Se registró correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error: no se pudo actualizar el archivo");
        }
    }
}
