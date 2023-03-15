package lesson8;
import java.awt.*;
import javax.swing.*;

public class Swing extends JFrame {

    public static void main(String[] args) {
        new Swing();
    }
Swing() {
        super("Отменить отмену?");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton button1 = new JButton();
        button1.setText("отменить");
        container.add(button1);

        JButton button2 = new JButton();
        button2.setText("отмена");
        container.add(button2);

        setSize(320, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}