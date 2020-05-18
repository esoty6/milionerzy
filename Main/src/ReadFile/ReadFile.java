package ReadFile;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    int pointer = 0;
    public void importFile(){
        try {
            do {
                String line = Files.readAllLines(Paths.get("D:\\Studia\\Projekty JAVA\\milionerzy\\Main\\src\\Questions\\questions.txt")).get(pointer);
                System.out.println(line);
                pointer++;
            } while (pointer%6 != 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
