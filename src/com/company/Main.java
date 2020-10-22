package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GraphicsDemo gDemo = new GraphicsDemo();
        frame.add(gDemo);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1600, 800);
        frame.setTitle("Task2");
        frame.setVisible(true);
    }
}
