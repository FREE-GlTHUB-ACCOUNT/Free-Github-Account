import javax.swing.*;
import java.awt.*;
public class PlayMe {
    static int a = Toolkit.getDefaultToolkit().getScreenSize().width;
    static int b = Toolkit.getDefaultToolkit().getScreenSize().height;
    static volatile JFrame frame = new JFrame();
    static JButton button = new JButton("☺");
    public static void main(String[] args) throws InterruptedException {
        button.setFocusPainted(false);
        button.setBounds((a-40)/2, (b-20)/2, 40, 20);
        frame.setVisible(true);
        frame.add(button);
        frame.setLayout(new GridBagLayout());
        frame.setResizable(false);
        frame.setSize(400, 200);
        frame.setLocation((a-400)/2, (b-200)/2);
        frame.setTitle("You can trust me...");
        button.addActionListener(f->{try{
            Thread dis = new Thread(new Runnable() {
                public void run() {
                    try{side();}catch(Exception abcya){}
                }
            }); 
            dis.start();
        }catch(Exception e){}});
    }
    public static void side() throws InterruptedException {
        ImageIcon img = new ImageIcon("anothereye.png");
        frame.setIconImage(img.getImage());
        frame.remove(button);
        JLabel label = new JLabel("HAHAHAHA", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.PLAIN, 120));
        frame.add(label);
        frame.getContentPane().revalidate();
        frame.repaint();
        frame.setTitle("DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE");
        frame.setSize(1200, 600);
        frame.getContentPane().setBackground(Color.red);
        label.setForeground(Color.black);
        for (int e = 0; e < 50; e++) {
            int c = (a-1200)/2 + (int)((Math.random()*10)-5);
            int d = (b-600)/2 + (int)((Math.random()*10)-5);
            frame.setLocation(c, d);
            frame.getContentPane().setBackground(Color.black);
            label.setForeground(Color.red);
            Thread.sleep(30);
            c = (a-1200)/2 + (int)((Math.random()*10)-5);
            d = (b-600)/2 + (int)((Math.random()*10)-5);
            frame.setLocation(c, d);
            frame.getContentPane().setBackground(Color.red);
            label.setForeground(Color.black);
            Thread.sleep(30);
        }
        System.exit(0);
    }
}