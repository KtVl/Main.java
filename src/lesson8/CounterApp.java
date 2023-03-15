package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;

    public static void main(String[] args) {
        new CounterApp(0);
    }
CounterApp (final int initialValue) {
        setTitle(" ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,150);
        setLocationRelativeTo(null);

        value = initialValue;

        JLabel couterValueView = new JLabel();
        couterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(couterValueView,BorderLayout.CENTER);

        couterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton(" < ");
        decrementButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent){
                        value--;
                        couterValueView.setText(String.valueOf(value));
                    }
                }
        );
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(" > ");
        incrementButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    value++;
                    couterValueView.setText(String.valueOf(value));
                }
            }
    );
        add(incrementButton, BorderLayout.EAST);

        setVisible(true);
    }
}
