import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class swing {
    public static void main(String[] args) {
//        new Jframe();
        new Jtextfield();
    }
}

class JframeMain {
    JFrame f;

    JframeMain() {
        f = new JFrame();
        f.setLayout(null); //positioning absolute

        f.setSize(440, 240);
        f.setLocationRelativeTo(null);
        f.setTitle("This is Swing");
        f.getContentPane().setBackground(new Color(122, 222, 222));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

//this jframe for JLabel
class Jframe extends JframeMain implements ActionListener {

    JButton btn;
    JLabel l;
    TextField tf;

    Jframe() {
        btn = new JButton("Muku");
        btn.setBounds(170, 80, 100, 40);
        btn.setFocusable(false);
        btn.setBackground(new Color(255, 254, 254));

        tf = new TextField();
        tf.setBounds(150, 130, 200, 40);

        btn.addActionListener(this);
        l = new JLabel();
        l.setBounds(150, 170, 300, 40);

        f.add(btn);
        f.add(tf);
        f.add(l);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("Ip of " + host + " is " + ip);
        } catch (UnknownHostException ex) {
            throw new RuntimeException(ex);
        }
    }
}


//This for JTextField
class Jtextfield extends Jframe {
    JTextField t1;

    Jtextfield() {
        t1 = new JTextField("This is first text field");
        t1.setBounds(50, 50, 120, 20);

        f.add(t1);
    }

}