import javax.swing.*;
import java.awt.*;
public class Condiments {
    static JFrame frame = new JFrame();
    static int a = Toolkit.getDefaultToolkit().getScreenSize().width;
    static int b = Toolkit.getDefaultToolkit().getScreenSize().height;
    static ImageIcon sadkendrick = new ImageIcon("kendricksad.jpg");
    static ImageIcon happykendrick = new ImageIcon("kendrickhappy.jpg");
    static ImageIcon ketchup = new ImageIcon("Ketchup(1).png");
    static ImageIcon mustard = new ImageIcon("Mustard(1).png");
    static JLabel label = new JLabel("Ketchup, or Mustard?");
    static JButton kbutton = new JButton(ketchup);
    static JButton mbutton = new JButton(mustard);
    public static void main() throws InterruptedException {
        frame.setSize(630, 579);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints w = new GridBagConstraints();
        frame.setVisible(true);
        frame.setTitle("Pick one!");
        kbutton.setFocusPainted(false);
        kbutton.setBorderPainted(false);
        kbutton.setContentAreaFilled(false);
        kbutton.setBounds((a-251)/2, (b-539)/2, 251, 539);
        mbutton.setFocusPainted(false);
        mbutton.setBorderPainted(false);
        mbutton.setContentAreaFilled(false);
        mbutton.setBounds((a-251)/2, (b-539)/2, 251, 539);
        label.setFont(new Font("Arial", Font.PLAIN, 60));
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 0;
        w.gridx = 0;
        frame.add(kbutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 0;
        w.gridx = 2;
        frame.add(mbutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 0;
        w.gridx = 1;
        frame.add(label, w);
        frame.setSize(a, b);
        kbutton.addActionListener(f->{
            Thread dis = new Thread(new Runnable() {
                public void run() {
                    try{ketchup();}catch(Exception abcya){}
                }
            }); 
            dis.start();    
        });
        mbutton.addActionListener(f->{
            Thread dis = new Thread(new Runnable() {
                public void run() {
                    try{mustard();}catch(Exception abcya){}
                }
            }); 
            dis.start();
        });
    }
    public static void mustard() {
        frame.setSize(630, 579);
            frame.remove(kbutton);
            frame.remove(mbutton);
            frame.remove(label);
            JLabel kendrick = new JLabel(happykendrick);
            frame.add(kendrick);
            frame.repaint();
            frame.getContentPane().revalidate();
            frame.setTitle("MUSTAAAAAAAAAAAAAAAAAAAAARD!!!");
            for (int e = 0; e < 100; e++) {
                int c = (a-630)/2 + (int)((Math.random()*100-50));
                int d = (b-579)/2 + (int)((Math.random()*100-50));
                frame.setLocation(c, d);
                try{Thread.sleep(30);}catch(Exception g){}
            }
            System.exit(1);
    }
    public static void ketchup() {
        frame.setSize(630, 579);
        frame.remove(kbutton);
        frame.remove(mbutton);
        frame.remove(label);
        JLabel kendrick = new JLabel(sadkendrick);
        frame.add(kendrick);
        frame.repaint();
        frame.getContentPane().revalidate();
        frame.setTitle(":(");
        frame.setLocation((a-630)/2, (b-579)/2);
        try{Thread.sleep(3000);}catch(Exception x){}
        System.exit(1);
    }
}
