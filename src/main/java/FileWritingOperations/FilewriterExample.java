package FileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FilewriterExample {

    //LAO

    public  static void main(String[]args) throws IOException {

        String location = "Usingfilewriter.txt";
        String content = "This Code is Written by Ezhil and Learned by LAO";


        FileWriter fr = new FileWriter(location);
        fr.write(content);
        fr.close();


    }
}
