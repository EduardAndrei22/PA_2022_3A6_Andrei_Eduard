package com.company;

import javax.swing.*;

import java.awt.event.MouseAdapter;

import static sun.tools.jconsole.OutputViewer.init;

public class MouseEvent  extends JPanel {
    protected final MainFrame frame;
    private final JButton circleButton = new JButton("  Circle  ");

    JButton redButton = new JButton(" ");
    JButton blueButton = new JButton(" ");

    public MouseEvent(MainFrame frame) {
        this.frame = frame;
        init(2,3);
    }



    final void init(int rows, int cols) {
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                drawStone(e.getX(), e.getY());
                repaint();
            }
            
        });
    }
    private void drawStone(int x, int y) {
        DebugGraphics g = null;
        g.drawOval(x,y, 150, 150);
    }
}


