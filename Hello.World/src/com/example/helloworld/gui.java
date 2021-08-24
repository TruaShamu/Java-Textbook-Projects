package com.example.helloworld;

import javax.swing.*;
import java.awt.*;


public class gui extends JFrame {
    JFrame as = new JFrame("GUI Hello World!");
    private JLabel title;

    public gui() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        BoxLayout boxLayout = new BoxLayout(as.getContentPane(), BoxLayout.Y_AXIS);
        as.setLayout(boxLayout);
        as.pack();
        as.setVisible(true);

        title = new JLabel("GUI Hello World!");
        title.setFont(new Font("Roboto", Font.PLAIN, 30));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        as.add(title);
        as.setLocationRelativeTo(null);
        as.setSize(400, 200);
        as.setVisible(true);
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}


