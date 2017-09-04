import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;


public class JsonReader {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject =(JSONObject) jsonParser.parse(new FileReader("C:\\Users\\User\\IdeaProjects\\Validation\\src\\Car.json"));
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("Car"));

    }
}

