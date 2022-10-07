package JsonOperations;


import com.google.gson.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWritingExample {

    public static void main(String[]args) throws IOException {

        String location = "JSONwriter.json";

        JSONObject jsonobj = new JSONObject();
        jsonobj.put("Name","EzhilRaj");
        jsonobj.put("Age","23");

        JSONArray jsonarr = new JSONArray();
        jsonarr.add("Rajakadai");
        jsonarr.add("Tiruvottiyur");

        jsonobj.put("Address",jsonarr);

        FileWriter filewriter = new FileWriter(location);
        filewriter.write(jsonobj.toJSONString());
        filewriter.close();





    }
}
