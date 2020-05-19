package ReadFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
    private long lines;

    public long read(){
        try {
            Stream<String> str = Files.lines(Paths.get("Main\\src\\Questions\\questions.txt"));
            lines = str.count();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }
}