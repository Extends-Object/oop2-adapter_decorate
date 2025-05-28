package E3_adapter_decorate;

import java.io.*;

public class ExportSinValidaciones extends ExportDecorador{

    public ExportSinValidaciones(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void exportar(File file) {

//      El objeto guardado en el super es el ExportadorArchivo que recibio por constructor y lo mando por super
//      Por lo tanto cuando se llama a super:
//      ----> Se ejecuta exportar(File file) de Decorador
//      ----> public void exportar(File file) ----> this.exportador.exportar(file); ----> Es el ExportadorArchivo
//      ----> En ExportadorArchivo: public void exportar(File file) ----> Metodo base

        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar...");
        }
        //Solo verifica si es nulo --- permite sobrescribir

        super.exportar(file);
    }
}
