package CheckAns;

import java.io.FileReader;

public class Check {
    int points = 0;

    public void goodAns(String a){
        FileReader reader;

        try {
            reader = new FileReader("D:\\Studia\\Projekty JAVA\\milionerzy\\Main\\src\\Questions\\answers.txt");
            int content;
            int n = 0;
            char[] b = a.toCharArray();
            while ((content = reader.read()) != -1) {
                if(b[n] == ((char)content)) points++;
                n++;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int result(){
        return points;
    }
}
