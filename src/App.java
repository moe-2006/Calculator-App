import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(maths.addnumber(2, 4));

        JFrame frame = new JFrame("Calculator");
        JLabel label = new JLabel("idk what this is yet");
        JPanel panel = new JPanel();
        JButton button = new JButton();
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        frame.setSize(700, 700);
        frame.setLocation(610,190);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);
    }
}
