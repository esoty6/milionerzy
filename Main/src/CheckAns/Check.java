package CheckAns;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Check {
    private int points = 0;
    private int pointer = 0;

    public void goodAns(String a){
        try {
            String line = Files.readAllLines(Paths.get("D:\\Studia\\Projekty JAVA\\milionerzy\\Main\\src\\Questions\\answers.txt")).get(pointer);
            pointer++;
            if(a.equals(line)) points++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int result(){
        return points;
    }
}
