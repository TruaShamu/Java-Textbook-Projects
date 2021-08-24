//checkerboard without using simpleanimation

import javax.swing.*;
import java.awt.*;


public class Checker2 extends JPanel {
    int sqx = 50;
    int sqy = 50;
    int x = 0;
    int y = 0;

    public void paint(Graphics g) {
        for (x = 0; x <= 400; x = x + 80) {
            g.setColor(Color.red);    //red square
            g.fillRect(x, y, sqx, sqy);
            g.drawRect(x, y, sqx, sqy);
        }
        for (y = 0; y <= 400; y = y + 80) {
            g.setColor(Color.red);    //red square
            g.fillRect(x, y, sqx, sqy);
            g.drawRect(x, y, sqx, sqy);
        }
        for (x = 40; x <= 400; x += 80) {
            g.setColor(Color.black);    //black square
            g.fillRect(x, y, sqx, sqy);
            g.drawRect(x, y, sqx, sqy);
        }

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.getContentPane().add(new Checker2());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

