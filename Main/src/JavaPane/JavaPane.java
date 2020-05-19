package JavaPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaPane implements ActionListener {
    private int pointer = 0;
    private int pointerC = 0;

    private String question = "Witaj w quizie";
    private String answerA = "";
    private String answerB = "";
    private String answerC = "";
    private String answerD = "";
    private String correct = "";

    JLabel labl;
    JFrame frame;
    JPanel panel;

    public JavaPane() {
        frame = new JFrame();
        JButton button = new JButton("Rozpocznij gre");
        button.addActionListener(this);

        labl = new JLabel(question);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0 ,1));
        panel.add(button);
        panel.add(labl);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Milionerzy");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(pointer < 11) {
            ReadFile();
            pointer += 6;
            pointerC++;
            labl.setText(question);
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
