package ReadFile;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    int pointer = 0;
    public void importFile(){
        String line;
        try {
            line = Files.readAllLines(Paths.get("D:\\Studia\\Projekty JAVA\\milionerzy\\Main\\src\\Questions\\questions.txt")).get(pointer);
            System.out.println(line);
            for(pointer = 1; pointer < line.length(); pointer++) {
                line = Files.readAllLines(Paths.get("D:\\Studia\\Projekty JAVA\\milionerzy\\Main\\src\\Questions\\questions.txt")).get(pointer);
                System.out.println(line);
            }
            pointer++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
