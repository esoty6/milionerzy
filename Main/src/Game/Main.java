package Game;

import CheckAns.Check;
import ReadFile.ReadFile;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Check ans = new Check();
        ReadFile file = new ReadFile();

        Scanner input = new Scanner(System.in);
        file.importFile();
        String answer = input.next();
        ans.goodAns(answer);
        file.importFile();

    }
}
