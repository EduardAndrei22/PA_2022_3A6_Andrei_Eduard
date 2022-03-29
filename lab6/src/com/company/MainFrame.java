package com.company;

import javax.swing.*;

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
        add(this.configPanel,NORTH);
        add(this.controlPanel,SOUTH);


        this.pack();
    }
}
