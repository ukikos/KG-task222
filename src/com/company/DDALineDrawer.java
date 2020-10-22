package com.company;

import com.company.interfaces.LineDrawer;
import java.awt.*;

public class DDALineDrawer implements LineDrawer {

    public void drawLine(PixelDrawer pd, int x1, int y1, int x2, int y2, Color color) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        double D = Math.max(Math.abs(dx), Math.abs(dy));
        double Dy = (double) dy / D;
        double Dx = (double) dx / D;

        for (int i = 0; i <= D; i++) {
            pd.drawPixel(x1 + (int) (Dx * i), y1 + (int) (Dy * i), color);
        }
    }
}
