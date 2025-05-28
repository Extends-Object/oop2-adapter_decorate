package E3_adapter_decorate;

import java.io.File;

public interface Exportador {

    //Todos los exportadores (con o sin decoradores) tienen implementar esto

    public void exportar(File file);
}
