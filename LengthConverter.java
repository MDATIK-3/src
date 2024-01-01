import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LengthConverter extends JFrame {
    private JTextField inputField;
    private JTextField outputField;

    public LengthConverter() {
        setTitle("Length Converter");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JLabel inputLabel_1 = new JLabel("1. Kilometers To Meters");
        inputLabel_1.setOpaque(true);
        inputLabel_1.setBackground(new Color(234, 234, 234));
        inputLabel_1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openInputDialog("Kilometers To Meters");
            }
        });

        JLabel inputLabel_2 = new JLabel("2. Meters To Centimeters");
        inputLabel_2.setOpaque(true);
        inputLabel_2.setBackground(new Color(224, 224, 224));
        inputLabel_2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openInputDialog("Meters To Centimeters");
            }
        });

        JLabel inputLabel_3 = new JLabel("3. Meters To Feets");
        inputLabel_3.setOpaque(true);
        inputLabel_3.setBackground(new Color(203, 202, 202));
        inputLabel_3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openInputDialog("Meters To Feets");
            }
        });

        JLabel inputLabel_4 = new JLabel("4. Feets To Inch");
        inputLabel_4.setOpaque(true);
        inputLabel_4.setBackground(new Color(188, 188, 188));
        inputLabel_4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openInputDialog("Feets To Inch");
            }
        });

        panel.add(inputLabel_1);
        panel.add(inputLabel_2);
        panel.add(inputLabel_3);
        panel.add(inputLabel_4);

        add(panel);
    }

    private void openInputDialog(String conversionType) {
        String inputValue = JOptionPane.showInputDialog(this, "Enter value to convert for " + conversionType);
        double outputValue = 0;
        switch (conversionType) {
            case "Kilometers To Meters":
                outputValue = Double.parseDouble(inputValue) * 1000;
                break;
            case "Meters To Centimeters":
                outputValue = Double.parseDouble(inputValue) * 100;
                break;
            case "Meters To Feets":
                outputValue = Double.parseDouble(inputValue) * 3.28084;
                break;
            case "Feets To Inch":
                outputValue = Double.parseDouble(inputValue) * 12;
                break;
        }
        String message = String.format("Converted value for %s is: %.2f", conversionType, outputValue);
        JOptionPane.showMessageDialog(this, message);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LengthConverter().setVisible(true);
            }
        });
    }
}
