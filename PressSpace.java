import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class PressSpace {
    static boolean thishappend = false;
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("anothereye.png");
        ImageIcon otherimg = new ImageIcon("Untitled.png");
        frame.setResizable(false);
        JLabel eye = new JLabel(img, SwingConstants.CENTER);
        frame.setVisible(true);
        frame.setSize(1800, 900);
        int a = Toolkit.getDefaultToolkit().getScreenSize().width;
        int c = Toolkit.getDefaultToolkit().getScreenSize().height;
        frame.setLocation((a-1800)/2, (c-900)/2);
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {try{
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    thishappend = true;
                }
                } catch(Exception p){}
            }; 
            public void keyReleased(KeyEvent g) {
                int keyCode = g.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    thishappend = false;
                }
            }
        });
        while (true) {
            if (thishappend) {
                frame.setIconImage(img.getImage()); 
                frame.add(eye);
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);
                frame.getContentPane().setBackground(new Color(r, g, b));
                Thread.sleep(30);
                frame.setLocation((a-1800)/2, (c-900)/2);
            } else {
                frame.setIconImage(otherimg.getImage()); 
                frame.remove(eye);
                frame.getContentPane().revalidate();
                frame.repaint();
                frame.getContentPane().setBackground(Color.white);
                frame.setLocation((a-1800)/2, (c-900)/2);
            }
        }
    }
}