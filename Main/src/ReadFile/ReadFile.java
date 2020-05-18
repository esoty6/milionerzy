package ReadFile;

import JavaPane.JavaPane;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static int pointer = 0;
    public static int pointerC = 0;

    public static String question = "";
    public static String answerA = "";
    public static String answerB = "";
    public static String answerC = "";
    public static String answerD = "";
    public static String correct = "";

    public ReadFile() {
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

        JavaPane window = new JavaPane(question, answerA, answerB, answerC, answerD, correct);
    }
}