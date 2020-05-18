package ReadFile;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    private static int pointer = 0;
    private static int limiter = 5;
    private static int starter = 1;
    public void importFile(){
        try {
            String line = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer);
            System.out.println(line);
            for(pointer = starter; pointer < limiter; pointer++) {
                line = Files.readAllLines(Paths.get("Main\\src\\Questions\\questions.txt")).get(pointer);
                System.out.println(line);
            }
            starter += 6;
            limiter += 6;
            pointer++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
