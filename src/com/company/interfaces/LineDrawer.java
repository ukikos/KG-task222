package com.company.interfaces;

import com.company.PixelDrawer;
import java.awt.*;

public interface LineDrawer {
    void drawLine(PixelDrawer pd, int x1, int y1, int x2, int y2, Color color);
}
