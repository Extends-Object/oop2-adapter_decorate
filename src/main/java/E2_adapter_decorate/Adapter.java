package E2_adapter_decorate;

import java.awt.*;

public class Adapter implements Panel{

    private final Graphics2D gg;

    public Adapter(Graphics2D gg) {
        this.gg = gg;
    }


    @Override
    public void dibujarCirculo(int x, int y, int radio) {
        gg.drawOval(x - radio, y - radio, radio * 2, radio * 2);
    }

    @Override
    public void dibujarLinea(int x1, int y1, int x2, int y2) {
        gg.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void dibujarTexto(String texto, int x, int y) {
        gg.drawString(texto, x, y);
    }
}
