package Game;

import CheckAns.Check;
import ReadFile.ReadFile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Check ans = new Check();
        ReadFile[] file = new ReadFile[2];

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < file.length; i++) {
            file[i] = new ReadFile();
            file[i].importFile();
            String answer = input.next();
            ans.goodAns(answer);
        }
        System.out.println(ans.result());
    }
}
