import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputStream {
    public static final String FILENAME = "C:\\Users\\User\\IdeaProjects\\Lessons14\\src\\file1.txt";

    public static void main(String[] args) throws IOException {
        Path path =  Paths.get(FILENAME);
        List<String> lines = Files.readAllLines(path , StandardCharsets.UTF_8);
        int position = 2;
        String extra = "qwe";
        lines.add(position,extra);
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
        for(String line:lines){
            bw.append(line);
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

}
