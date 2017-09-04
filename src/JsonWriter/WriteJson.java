import org.json.simple.JSONObject;

import java.io.*;

public class WriteJson {
    public void writeJson() {
        JSONObject obj = new JSONObject();
        obj.put("Name", "Denis");
        obj.put("Surname", "Shevchenko");
        obj.put("Age", "20");


        File file = new File("C:\\Users\\User\\IdeaProjects\\WriteJson\\src\\WRITEJSON.json");

        try {

            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
            stream.writeObject(obj.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



