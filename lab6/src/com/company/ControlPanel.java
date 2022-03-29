package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exitBtn = new JButton("Exit");
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");


    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }
    private void init() {

        setLayout(new GridLayout(1, 4));

        exitBtn.addActionListener(this::exitGame);
        loadBtn.addActionListener(this::LoadGame);
        saveBtn.addActionListener(this::SaveGame);
    }
    private void exitGame(ActionEvent e) {
        frame.dispose();
    }
    private void LoadGame(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to load from:");
        if (fileChooser.showOpenDialog(this.frame) == 0) {
            File loadFile = fileChooser.getSelectedFile();
            System.out.println("Loading file: " + loadFile.getAbsolutePath());

            try {
                BufferedImage image = ImageIO.read(loadFile);
                this.frame.canvas.loadImage(image);
            } catch (IOException var5) {
                var5.printStackTrace();
            }
        }

    }

    private void SaveGame(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save:");
        if (fileChooser.showSaveDialog(this.frame) == 0) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());

            try {
                ImageIO.write(this.frame.canvas.image, "png", new FileOutputStream(fileToSave.getAbsolutePath()));
            } catch (IOException var5) {
                System.err.println(var5.getMessage());
            }
        }

    }

}

