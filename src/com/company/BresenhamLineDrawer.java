package com.company;

import com.company.interfaces.LineDrawer;

import java.awt.*;

public class BresenhamLineDrawer implements LineDrawer {

    public void drawLine(PixelDrawer pd, int x1, int y1, int x2, int y2, Color color) {
        int dx_abs = Math.abs(x1 - x2);
        int dy_abs = Math.abs(y1 - y2);
        if (dx_abs > dy_abs) {
            drawHorizontal(pd, x1, y1, x2, y2, color);
        } else {
            drawVertical(pd, x1, y1, x2, y2, color);
        }
    }

    public void drawHorizontal(PixelDrawer pd, int x1, int y1, int x2, int y2, Color color) {
        if (x2 < x1) {
            int temp = y2;
            y2 = y1;
            y1 = temp;
            temp = x2;
            x2 = x1;
            x1 = temp;
        }
        int dir_y = y2 - y1;
        if (dir_y > 0) dir_y = 1;
        else dir_y = -1;

        int dx_abs = Math.abs(x1 - x2);
        int dy_abs = Math.abs(y1 - y2);
        int error = 0;
        int dErr = (dy_abs + 1);
        int y = y1;

        for (int x = x1; x < x2; x++) {
            pd.drawPixel(x, y, color);
            error += dErr;
            if (error >= (dx_abs + 1)) {
                y += dir_y;
                error -= (dx_abs + 1);
            }
        }
    }

    public void drawVertical(PixelDrawer pd, int x1, int y1, int x2, int y2, Color color) {
        if(y2<y1){
            int temp= y2;
            y2=y1;
            y1=temp;
            temp=x2;
            x2=x1;
            x1=temp;
        }
        int dir_x = x2 - x1;
        if (dir_x > 0) dir_x = 1;
        else dir_x = -1;

        int dx_abs = Math.abs(x1 - x2);
        int dy_abs = Math.abs(y1 - y2);
        int error = 0;
        int dErr = (dx_abs + 1);
        int x = x1;

        for (int y = y1; y < y2; y++) {
            pd.drawPixel(x, y, color);
            error += dErr;
            if (error >= (dy_abs + 1)) {
                x += dir_x;
                error -= (dy_abs + 1);
            }
        }
    }



}
