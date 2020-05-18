package Game;

import CheckAns.Check;
import ReadFile.ReadFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadFile fe = new ReadFile();
        Check ans = new Check();
        fe.importFile();

        Scanner input = new Scanner(System.in);
        String answer = input.next();

        ans.goodAns(answer);
        System.out.println(ans.result());
    }
}
