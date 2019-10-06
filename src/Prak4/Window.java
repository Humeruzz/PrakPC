package Prak4;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

    int l = 0, r = 0;
    JPanel [] jp = new JPanel[2];
    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    Font fn = new Font("TimesNewRoman", Font.BOLD,40);
    Font bFn = new Font("TimesNewRoman", Font.PLAIN,20);


    Window() {
        super("Window");
        setSize(400, 400);
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        for (int i = 0; i < jp.length; i++) {
            jp[i] = new JPanel();
            add(jp[i]);
        }
        jp[0].setLayout(new BorderLayout());
        jp[0].add(label1, BorderLayout.NORTH);
        label1.setFont(fn);
        jp[0].add(label2, BorderLayout.CENTER);
        label2.setFont(fn);
        jp[0].add(label3, BorderLayout.SOUTH);
        label3.setFont(fn);
        jp[1].setLayout(new GridLayout(2, 3, 5, 5));
        jp[1].add(button1);
        button1.setFont(bFn);
        jp[1].add(button2);
        button2.setFont(bFn);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                l++;
                label1.setText("Result: " + l + " X " + r);
                label2.setText("Last Scorer: " + button1.getText());
                if (l > r){ label3.setText("Winner: " + button1.getText());}
                else if (l < r) { label3.setText("Winner: " + button2.getText());}
                else { label3.setText("Winner: Draw");}
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                r++;
                label1.setText("Result: " + l + " X " + r);
                label2.setText("Last Scorer: " + button2.getText());
                if (l > r){ label3.setText("Winner: " + button1.getText());}
                else if (l < r) { label3.setText("Winner: " + button2.getText());}
                else { label3.setText("Winner: Draw");}
            }
        });
    }
}
