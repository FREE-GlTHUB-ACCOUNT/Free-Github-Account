import javax.swing.*;
import java.awt.*;
public class SIXSEVENEXE {
    static String say = "";
    public static void main(String[] args) throws InterruptedException {
        int a = Toolkit.getDefaultToolkit().getScreenSize().width;
        int b = Toolkit.getDefaultToolkit().getScreenSize().height;
        ImageIcon img = new ImageIcon("67(1).jpg");
        ImageIcon otherimg = new ImageIcon("Untitled.png");
        GridBagConstraints w = new GridBagConstraints();
        JButton onebutton = new JButton("1");
        onebutton.setFocusPainted(false);
        onebutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton twobutton = new JButton("2");
        twobutton.setFocusPainted(false);
        twobutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton threebutton = new JButton("3");
        threebutton.setFocusPainted(false);
        threebutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton fourbutton = new JButton("4");
        fourbutton.setFocusPainted(false);
        fourbutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton fivebutton = new JButton("5");
        fivebutton.setFocusPainted(false);
        fivebutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton sixbutton = new JButton("6");
        sixbutton.setFocusPainted(false);
        sixbutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton sevenbutton = new JButton("7");
        sevenbutton.setFocusPainted(false);
        sevenbutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton eightbutton = new JButton("8");
        eightbutton.setFocusPainted(false);
        eightbutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton ninebutton = new JButton("9");
        ninebutton.setFocusPainted(false);
        ninebutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton zerobutton = new JButton("0");
        zerobutton.setFocusPainted(false);
        zerobutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JButton clearbutton = new JButton("X");
        clearbutton.setFocusPainted(false);
        clearbutton.setBounds((a-40)/2, (b-20)/2, 40, 20);
        JLabel label = new JLabel(say);
        JFrame frame = new JFrame();
        frame.setTitle("Type any number you want! Just don't type THAT number...");
        frame.setIconImage(otherimg.getImage()); 
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);
        frame.setSize(1200, 600);
        frame.setLocation((a-1200)/2, (b-600)/2);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 0;
        frame.add(onebutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 1;
        frame.add(twobutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 2;
        frame.add(threebutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 3;
        frame.add(fourbutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 4;
        frame.add(fivebutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 5;
        frame.add(sixbutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 6;
        frame.add(sevenbutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 7;
        frame.add(eightbutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 8;
        frame.add(ninebutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 9;
        frame.add(zerobutton, w);
        w.fill = GridBagConstraints.HORIZONTAL;
        w.gridy = 1;
        w.gridx = 10;
        frame.add(clearbutton, w);
        w.fill = GridBagConstraints.VERTICAL;
        w.gridy = 0;
        w.gridx = 5;
        frame.add(label, w);
        onebutton.addActionListener(f->{
            say = say + "1";
            label.setText(say);
        });
        twobutton.addActionListener(f->{
            say = say + "2";
            label.setText(say);
        });
        threebutton.addActionListener(f->{
            say = say + "3";
            label.setText(say);
        });
        fourbutton.addActionListener(f->{
            say = say + "4";
            label.setText(say);
        });
        fivebutton.addActionListener(f->{
            say = say + "5";
            label.setText(say);
        });
        sixbutton.addActionListener(f->{
            say = say + "6";
            label.setText(say);
        });
        sevenbutton.addActionListener(f->{
            say = say + "7";
            label.setText(say);
        });
        eightbutton.addActionListener(f->{
            say = say + "8";
            label.setText(say);
        });
        ninebutton.addActionListener(f->{
            say = say + "9";
            label.setText(say);
        });
        zerobutton.addActionListener(f->{
            say = say + "0";
            label.setText(say);
        });
        clearbutton.addActionListener(f->{
            say = "";
            label.setText(say);
        });
        while (true) {
            if (say.equals("67")) {
                    frame.remove(onebutton);
                    frame.remove(twobutton);
                    frame.remove(threebutton);
                    frame.remove(fourbutton);
                    frame.remove(fivebutton);
                    frame.remove(sixbutton);
                    frame.remove(sevenbutton);
                    frame.remove(eightbutton);
                    frame.remove(ninebutton);
                    frame.remove(zerobutton);
                    frame.remove(clearbutton);
                    frame.remove(label);
                    frame.repaint();
                    frame.setTitle("What have you done...");
                    frame.getContentPane().revalidate();
                    frame.getContentPane().setBackground(Color.black);
                    for (int e = 0; e < 100; e++) {
                        int c = (a-1200)/2 + (int)((Math.random()*10)-5);
                        int d = (b-600)/2 + (int)((Math.random()*10)-5);
                        frame.setLocation(c, d);
                        Thread.sleep(30);
                    }
                    JLabel kid = new JLabel(img);
                    w.fill = GridBagConstraints.HORIZONTAL;
                    w.gridy = 0;
                    w.gridx = 0;
                    frame.add(kid, w);
                    frame.setTitle("NOOOOOOOOOOOOOOOOOOOOOOOOO!!!");
                    frame.repaint();
                    frame.getContentPane().revalidate();
                    for (int e = 0; e < 150; e++) {
                        int c = (a-1200)/2 + (int)((Math.random()*100-50));
                        int d = (b-600)/2 + (int)((Math.random()*100-50));
                        frame.setLocation(c, d);
                        Thread.sleep(30);
                    }
                    System.exit(1);
            }
            System.out.println(say);
        }
    }
}
