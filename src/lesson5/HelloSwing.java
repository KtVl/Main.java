package lesson5;

import javax.swing.*;
import java.awt.*;

class HelloSwing extends JFrame {
    public static void main(String[] args) {
        new HelloSwing();
    }
    HelloSwing() {
        setTitle("HelloSwing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);

        Button btnExit = new Button("EXIT");
        btnExit.addActionListener(e -> System.exit(0));

        add (btnExit, BorderLayout.SOUTH);
        setVisible(true);
    }
}
