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

/*
        try {
            FileInputStream fis = new FileInputStream("D:\\Studia\\Projekty JAVA\\milionerzy\\Main\\src\\Questions\\questions.txt");
            Scanner src = new Scanner(fis);

            while(src.hasNext()) {
                System.out.println(src.nextLine());
                System.out.println(src.nextLine());
                System.out.println(src.nextLine());
                System.out.println(src.nextLine());
                System.out.println(src.nextLine());
                String answer = input.next();
                ans.goodAns(answer);
            }

            System.out.println(ans.result());

            src.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
