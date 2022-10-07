package JsonOperations;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonReadingExample {

    public static void main(String[] args) throws IOException, ParseException {

        String jsonlocation = "JSONwriter.json";

        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader(jsonlocation);
        Object parsedobj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) parsedobj;

        String name = (String) jsonObject.get("Name");
        Long age = (Long) jsonObject.get("Age");
        JSONArray address = (JSONArray) jsonObject.get("Address");

        Iterator iterator = address.iterator();
        System.out.println("Name is "+ name);
        System.out.println("Age is "+ age);
        while (iterator.hasNext()) {

            System.out.println("Address is "+ iterator.next());
        }


    }


}
