package E3_adapter_decorate;

import java.io.File;

public abstract class ExportDecorador implements Exportador{

    //Implementa el patrón básico de envolver otro exportador
    //Lo implementan los decoradores concretos

    protected Exportador exportador;        //Referencia al objeto que decora

    public ExportDecorador(Exportador exportador) {     //COMPOSICION
        this.exportador = exportador;
    }

    @Override
    public void exportar(File file) {
        this.exportador.exportar(file);     //Delega al objeto decorado
    }
}
