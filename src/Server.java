import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    Server() {
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(1, 129, 255));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);

        setSize(450, 700);
        setLocation(250, 150);
        getContentPane().setBackground(new Color(248, 249, 252));

        setVisible(true);
    }

    public static void main(String[] args) {
        new Server();
    }
}
