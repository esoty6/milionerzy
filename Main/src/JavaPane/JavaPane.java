package JavaPane;

import ReadFile.ReadFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaPane implements ActionListener {
    private int pointer = 0;
    private int pointerC = 0;
    private ReadFile file = new ReadFile();

    private String question = "Witaj w quizie";
    private String answerA = "";
    private String answerB = "";
    private String answerC = "";
    private String answerD = "";
    private String correct = "";

    JLabel questionAsked;
    JFrame frame;
    JPanel panel;
    JButton start, a, b, c, d, e;

    public JavaPane() {
        frame = new JFrame();
        start = new JButton("Rozpocznij gre");

        start.addActionListener(this);

        a = new JButton(answerA);
        b = new JButton(answerB);
        c = new JButton(answerC);
        d = new JButton(answerD);

        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);

        questionAsked = new JLabel(question);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        panel.setLayout(new GridLayout(0 ,1));
        panel.add(questionAsked);
        panel.add(start);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Milionerzy");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.remove(start);

        if(pointer < file.read()) {

            ReadFile();

            pointer += 6;
            pointerC++;

            questionAsked.setText(question);
            a.setText(answerA);
            b.setText(answerB);
            c.setText(answerC);
            d.setText(answerD);

            panel.add(a);
            panel.add(b);
            panel.add(c);
            panel.add(d);
        }
    }

    public void ReadFile() {
        try {
            question = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer);
            answerA = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer + 1);
            answerB = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer + 2);
            answerC = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer + 3);
            answerD = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer + 4);
            correct = Files.readAllLines(Paths.get("Main\\src\\Questions\\answers.txt")).get(pointerC);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
