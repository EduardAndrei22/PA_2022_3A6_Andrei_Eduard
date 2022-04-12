package com.company;

import javax.swing.*;

import static java.awt.BorderLayout.LINE_END;
import static java.awt.BorderLayout.LINE_START;
import static javax.swing.SwingConstants.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My Drawing Application");
        this.init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create the components
        canvas = new DrawingPanel(this);
        controlPanel= new ControlPanel(this);
        configPanel=new ConfigPanel(this);

        add(this.canvas, CENTER);
        add(this.configPanel,LINE_START);
        add(this.controlPanel,LINE_END);


        this.pack();
    }
}
