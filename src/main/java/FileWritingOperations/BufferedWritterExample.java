package FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterExample {

    public static void main(String[]args) throws IOException {

        String location = "UsingBufferedWritter.txt";
        String content = "This Code is Written by Ezhil and Learned by LAO";

        FileWriter fr = new FileWriter(location);
        BufferedWriter bf =  new BufferedWriter(fr);
        bf.write(content);
        bf.close();
    }

}
