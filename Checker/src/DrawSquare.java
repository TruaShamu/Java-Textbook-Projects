/*
 * Output:
 *
 */

import javax.swing.*;
import java.awt.*;

public class DrawSquare extends JPanel {

    public void paint(Graphics g) {
        g.setColor(Color.red);

        g.drawRect(0, 0, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new DrawSquare());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

