package ReadFile;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    private static int pointer = 0;
    public void importFile(){
        try {
            String line = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer);
            System.out.println(line);
            for(pointer = 1; pointer < 5; pointer++) {
                line = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer);
                System.out.println(line);
            }
            pointer++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
