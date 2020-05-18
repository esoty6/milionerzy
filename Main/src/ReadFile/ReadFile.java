package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public void importFile(){
        BufferedReader reader;
        try {
            int n = 1;
            reader = new BufferedReader(new FileReader("D:\\Studia\\Projekty JAVA\\milionerzy\\Main\\src\\Questions\\questions.txt"));
            String line = reader.readLine();
            while(line != null && (n % 6 != 0)){
                n++;
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
