package E3_adapter_decorate;

import java.io.*;

public class ExportConValidaciones extends ExportDecorador{

    public ExportConValidaciones(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void exportar(File file) {

        //logica con validaciones
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar...");
        }
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe...");
        }
        super.exportar(file);
    }
}
