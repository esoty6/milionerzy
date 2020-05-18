package Game;

import JavaPane.JavaPane;

import java.awt.event.WindowEvent;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static JavaPane window;
    public static void main(String[] args) {

        int pointerA = 0;
        int pointerC = 0;
        String question = "";
        String answerA = "";
        String answerB = "";
        String answerC = "";
        String answerD = "";
        String correct = "";

        try {
            question = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointerA);
            answerA = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointerA+1);
            answerB = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointerA+2);
            answerC = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointerA+3);
            answerD = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointerA+4);
            correct = Files.readAllLines(Paths.get("Main\\src\\Questions\\answers.txt")).get(pointerC);
        } catch (Exception e) {
            e.printStackTrace();
        }
        window = new JavaPane(question, answerA, answerB, answerC, answerD, correct);
        window.setLocationRelativeTo(null);
    }
}
