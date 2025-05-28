package E2_adapter_decorate;

class Texto implements Figura {
    private final Coordenada coordenada;
    private String texto;

    public Texto(Coordenada coordenada, String texto) {
        this.texto = texto;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarTexto(texto, coordenada.x(), coordenada.y());
    }


//    @Override
//    public void dibujar(Graphics2D g2d) {
//      g2d.drawString(texto, coordenada.x(), coordenada.y());
//    }

}
