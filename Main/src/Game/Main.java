package Game;

import JavaPane.JavaPane;
import ReadFile.ReadFile;

public class Main {
    public static void main(String[] args) {
        ReadFile file = new ReadFile();
        file.read();
        JavaPane okno = new JavaPane();
    }
}
