package com.company;

import com.company.interfaces.LineDrawer;

import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        PixelDrawer pd = new PixelDrawer(g2D);

        LineDrawer ldDDA = new DDALineDrawer();
        ldDDA.drawLine(pd, 400, 400, 550, 400, Color.PINK);
        ldDDA.drawLine(pd, 400, 400, 520, 600, Color.CYAN);
        ldDDA.drawLine(pd, 400, 400, 400, 700, Color.BLUE);
        ldDDA.drawLine(pd, 400, 400, 150, 550, Color.GREEN);
        ldDDA.drawLine(pd, 400, 400, 50, 380, Color.RED);
        ldDDA.drawLine(pd, 400, 400, 150, 200, Color.YELLOW);
        ldDDA.drawLine(pd, 400, 400, 400, 100, Color.BLACK);
        ldDDA.drawLine(pd, 400, 400, 520, 200, Color.GREEN);

        LineDrawer ldBresenham = new BresenhamLineDrawer();
        ldBresenham.drawLine(pd,800, 400, 1100, 380, Color.BLUE);
        ldBresenham.drawLine(pd,800, 400, 1000, 500, Color.BLUE);
        ldBresenham.drawLine(pd,800, 400, 800, 750, Color.BLUE);
        ldBresenham.drawLine(pd,800, 400, 700, 600, Color.BLUE);
        ldBresenham.drawLine(pd,800, 400, 600, 400, Color.BLUE);
        ldBresenham.drawLine(pd,800, 400, 700, 250, Color.BLUE);
        ldBresenham.drawLine(pd,800, 400, 790, 50, Color.BLUE);
        ldBresenham.drawLine(pd,800, 400, 890, 150, Color.BLUE);


        LineDrawer ldWU = new WULineDrawer();
        ldWU.drawLine(pd, 1200, 400, 1550, 400, Color.RED);
        ldWU.drawLine(pd, 1200, 400, 1400, 550, Color.RED);
        ldWU.drawLine(pd, 1200, 400, 1200, 700, Color.RED);
        ldWU.drawLine(pd, 1200, 400, 1100, 600, Color.RED);
        ldWU.drawLine(pd, 1200, 400, 890, 450, Color.RED);
        ldWU.drawLine(pd, 1200, 400, 1060, 320, Color.RED);
        ldWU.drawLine(pd, 1200, 400, 1200, 100, Color.RED);
        ldWU.drawLine(pd, 1200, 400, 1400, 240, Color.RED);
    }

//    public void paintComponent(Graphics g) {
//        Graphics2D g2D = (Graphics2D) g;
//        PixelDrawer pd = new PixelDrawer(g2D);
//
//        LineDrawer ld = new DDALineDrawer();
//        ld.drawLine(pd, 200, 100, 700, 400, Color.BLACK);
//        ld.drawLine(pd, 700, 250, 100, 550, Color.GREEN);
//
//        LineDrawer ld2 = new BresenhamLineDrawer();
//        ld2.drawLine(pd,400, 600, 100, 500, Color.BLUE);
//
//
//        LineDrawer ld3 = new WULineDrawer();
//        ld3.drawLine(pd, 100, 400, 600, 200, Color.GREEN);
//        ld3.drawLine(pd, 900, 150, 200, 700, Color.RED);
//    }
}
