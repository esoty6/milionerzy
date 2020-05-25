package JavaPane;

import ReadFile.ReadFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaPane implements ActionListener {
    private int pointer = 0;
    private int pointerC = 0;
    private final ReadFile file = new ReadFile();

    private String question = "Witaj w quizie";
    private String answerA = "";
    private String answerB = "";
    private String answerC = "";
    private String answerD = "";
    private String correct = "0";

    JLabel questionAsked;
    JFrame frame;
    JPanel panel;
    JButton start, a, b, c, d;

    public JavaPane() {
        frame = new JFrame();
        start = new JButton("Rozpocznij gre");

        start.addActionListener(this);

        a = new JButton();
        b = new JButton();
        c = new JButton();
        d = new JButton();

        a.setText(answerA);
        b.setText(answerB);
        c.setText(answerC);
        d.setText(answerD);

        a.setName("a");
        b.setName("b");
        c.setName("c");
        d.setName("d");

        a.addActionListener(this::actionPerformedA);
        b.addActionListener(this::actionPerformedB);
        c.addActionListener(this::actionPerformedC);
        d.addActionListener(this::actionPerformedD);

        questionAsked = new JLabel(question);
        questionAsked.setBounds(50, 50, 100, 100);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

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
        panel.setLayout(new GridLayout(0 ,1));

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
    public void actionPerformedA(ActionEvent e) {
        if(a.getName().equals(correct))
            System.out.println("Poprawna odpowiedz");
        else
            System.out.println("Bledna odpowiedz");

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
    public void actionPerformedB(ActionEvent e) {
        if(b.getName().equals(correct))
            System.out.println("Poprawna odpowiedz");
        else
            System.out.println("Bledna odpowiedz");

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
        } else {
            panel.remove(a);
            panel.remove(b);
            panel.remove(c);
            panel.remove(d);

            panel.repaint();

            questionAsked.setText("Dzieki za gre!");
            panel.setLayout(new FlowLayout());
            panel.add(questionAsked);
        }
    }
    public void actionPerformedC(ActionEvent e) {
        if(c.getName().equals(correct))
            System.out.println("Poprawna odpowiedz");
        else
            System.out.println("Bledna odpowiedz");

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
    public void actionPerformedD(ActionEvent e) {
        if(d.getName().equals(correct))
            System.out.println("Poprawna odpowiedz");
        else
            System.out.println("Bledna odpowiedz");

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
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
