package SimpleIdentity;

import javax.swing.*;
import java.awt.*;

public class A {

    JFrame frame;
    JButton button1,button2,button3;
    JTextField text1,text2;
    JLabel label,label1,label2;
    // constructor work
    A(){
        // make frame
        frame = new JFrame("Identity Card");
        label = new JLabel("USER");
        frame.setSize(400,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // make a  field of text input
        label1 = new JLabel("Username : ");
        label2 = new JLabel("Your ID : ");

        text1 = new JTextField(15);
        text2 = new JTextField(15);
        // make buttons.
        button1 = new JButton("Submit");
        button2 = new JButton("Clear");
        button3 = new JButton("Exit");
        // flowLayOut
        frame.setLayout(new FlowLayout());

        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setSize(300,200);

        frame.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new A();
            }
        });
    }

}
