package com.company;

import javax.swing.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JSpinner row;
    JSpinner column;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }


    public JSpinner getRow() {
        return this.row;
    }

    public JSpinner getColumn() {
        return this.column;
    }

    private void init() {
        //create the label and the spinner
        label = new JLabel("Grid size:");
        row = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        column =new JSpinner(new SpinnerNumberModel(10,2,100,1));
        add(label); //JPanel uses FlowLayout by default
        add(row);
        add(column);

    }

}
