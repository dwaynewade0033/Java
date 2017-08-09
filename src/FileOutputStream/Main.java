import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try(FileOutputStream  newFile=new FileOutputStream ("C:\\Users\\User\\Desktop\\log\\log3.txt"))
         {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s;
            while (!(s = reader.readLine()).equals(" ")) {
                byte[] buffer = s.getBytes();

                newFile.write(buffer, 0, buffer.length);

                System.out.println(s);

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }
}
