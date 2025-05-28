package E3_adapter_decorate;

import java.io.File;

class Report {

    private String reporte;
    private Exportador exportador;

    public Report(String reporte, Exportador exportador) {
        this.reporte = reporte;
        this.exportador = exportador;
    }

    void export(File file) {
        this.exportador.exportar(file);
    }
}
