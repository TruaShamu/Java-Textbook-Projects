import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation extends JPanel implements ActionListener {

    public void drawFrame(Graphics g, int frameNumber, int width, int height) {

        // Row number, from 0 to 7
        // Column number, from 0 to 7
        int x, y;   // Top-left corner of square

        for (y = 0; y < 400; y = y + 50) {

            for (x = 0; x < 400; x = x + 50) {
                if (((x / 50) % 2) == ((y / 50)) % 2)
                    g.setColor(Color.RED);
                else
                    g.setColor(Color.BLACK);
                g.fillRect(x, y, 50, 50);
            }

        }

    }

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public static void main(String[] args) {

        JFrame window = new JFrame("SimpleAnimation");
        SimpleAnimation drawingArea = new SimpleAnimation();
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);
        drawingArea.setPreferredSize(new Dimension(400, 400));
        window.pack();
        window.setLocation(100, 50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false); // The user can't change the size.
        Timer frameTimer = new Timer(20, drawingArea);
        window.setVisible(true);
        //frameTimer.start(); // commented out so we don't get an animation

    } // end main

    private int frameNum;

    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }
}
