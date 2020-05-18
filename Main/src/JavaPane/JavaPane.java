package JavaPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaPane extends JFrame {

    private JPanel btnpanel;

    public JavaPane(String qst, String ansA, String ansB, String ansC, String ansD, String answer){
        super("Milionerzy");
        JPanel btnpanel = new BtnPanel(qst, ansA, ansB, ansC, ansD, answer);
        add(btnpanel);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class BtnPanel extends JPanel implements ActionListener {

    private JLabel qst;
    private JButton a, b, c, d;
    private String correct, q1, q2, q3, q4;

    public BtnPanel(String question, String ansA, String ansB, String ansC, String ansD, String answer){
        qst = new JLabel(question);

        a = new JButton(ansA);
        b = new JButton(ansB);
        c = new JButton(ansC);
        d = new JButton(ansD);

        this.q1 = "a";
        this.q2 = "b";
        this.q3 = "c";
        this.q4 = "d";

        this.correct = answer;

        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);

        setLayout(new FlowLayout());

        add(qst);
        add(a);
        add(b);
        add(c);
        add(d);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if (src == a){
            if (q1.equals(correct)){
                JOptionPane.showMessageDialog(null, "Dobrze!");
            }
        }if (src == b){
            if (q2.equals(correct)){
                JOptionPane.showMessageDialog(null, "Dobrze!");
            }
        }if (src == c){
            if (q3.equals(correct)){
                JOptionPane.showMessageDialog(null, "Dobrze!");
            }
        }if (src == d){
            if (q4.equals(correct)){
                JOptionPane.showMessageDialog(null, "Dobrze!");
            }
        }
    }
}
