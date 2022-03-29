package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    int rows, cols;
    int canvasWidth = 400, canvasHeight = 400;
    int boardWidth, boardHeight;
    int cellWidth, cellHeight;
    int padX, padY;
    int stoneSize = 20;


    BufferedImage image; //the offscreen image
    Graphics2D offscreen; //the offscreen graphics
    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        init();
    }
    protected void createOffscreenImage() {
        image = new BufferedImage(
                canvasWidth, canvasHeight, BufferedImage.TYPE_INT_ARGB);
        offscreen = image.createGraphics();
        offscreen.setColor(Color.WHITE); //fill the image with white
        offscreen.fillRect(0, 0, canvasWidth, canvasHeight);
    }


private void paintGrid() {
    offscreen.setColor(Color.DARK_GRAY);
    //horizontal lines
    for (int row = 0; row < rows; row++) {
        int x1 = padX;
        int y1 = padY + row * cellHeight;
        int x2 = padX + boardWidth;
        int y2 = y1;
        offscreen.drawLine(x1, y1, x2, y2);
    }
    for (int col = 0; col < cols; col++) {
        int x1 = padX+col*cellWidth;
        int y1 = padY;
        int x2 = padX;
        int y2 = padY+boardHeight;
        offscreen.drawLine(x1, y1, x2, y2);
    }

    for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
            int x = padX + col * cellWidth;
            int y = padY + row * cellHeight;
            offscreen.setColor(Color.LIGHT_GRAY);
            offscreen.drawOval(x - stoneSize / 2, y - stoneSize / 2, stoneSize, stoneSize);
        }
    }
        }
@Override
public void update(Graphics g) { } //No need for update


@Override
protected void paintComponent(Graphics graphics) {
        graphics.drawImage(image, 0, 0, this);
        }

        public void loadImage(BufferedImage image) {
        this.offscreen.drawImage(image, 0, 0, (ImageObserver)null);
        this.repaint();
    }
    final void init() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawStone(e.getX(), e.getY());
                repaint();
            }
            //Can’t use lambdas, JavaFX does a better job in these cases
        });
    }
    private void drawStone(int x, int y) {

    }
}


