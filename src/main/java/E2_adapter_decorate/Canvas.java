package E2_adapter_decorate;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Adapter adaptador = new Adapter(g2d);

        for (Figura figura : figuras) {
            figura.dibujar(adaptador);
            //figura.dibujar(g2d);
            // FUERTE ACOPLAMIENTO ---> Clases de dominio (Figura) dependen de detalles de bajo nivel (Graphics2D)
        }
    }
}