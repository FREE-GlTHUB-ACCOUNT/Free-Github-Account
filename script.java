import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class script {
    public static void main(String[] args){
        int a = Toolkit.getDefaultToolkit().getScreenSize().width;
        int b = Toolkit.getDefaultToolkit().getScreenSize().height;
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1200, 600);
        int c = (a-1200)/2 + (int)((Math.random()*10)-5);
        int d = (b-600)/2 + (int)((Math.random()*10)-5);
        frame.setLocation(c, d);
        ImageIcon img = new ImageIcon("eyeman.png");
        JLabel eyeman = new JLabel(img, SwingConstants.CENTER);
        frame.add(eyeman);
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    int ex = eyeman.getX();
                    int ey = eyeman.getY();
                    eyeman.setLocation(ex, ey-10);
                }
                else if (keyCode == KeyEvent.VK_DOWN) {
                    int ex = eyeman.getX();
                    int ey = eyeman.getY();
                    eyeman.setLocation(ex, ey+10);
                }
                else if (keyCode == KeyEvent.VK_LEFT) {
                    int ex = eyeman.getX();
                    int ey = eyeman.getY();
                    eyeman.setLocation(ex-10, ey);
                }
                else if (keyCode == KeyEvent.VK_RIGHT) {
                    int ex = eyeman.getX();
                    int ey = eyeman.getY();
                    eyeman.setLocation(ex+10, ey);
                }
            }  
        });
    }
}
