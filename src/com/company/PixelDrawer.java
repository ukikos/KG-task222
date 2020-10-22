package com.company;

import com.company.interfaces.PixDrawer;
import java.awt.*;

public class PixelDrawer implements PixDrawer {
    private Graphics2D g;

    public PixelDrawer(Graphics2D g) {
        this.g = g;
    }

    public void drawPixel(int x, int y, Color color) {
        g.setColor(color);
        g.fillRect(x, y, 1, 1);
    }

    public void drawGradientPixel(int x, int y, Color color, float brightness) {
        int[] comp = {color.getRed(), color.getGreen(), color.getBlue()};
        Color col = new Color(comp[0]/255, comp[1]/255, comp[2]/255, brightness);
        g.setColor(col);
        g.fillRect(x, y, 1, 1);
    }
}
