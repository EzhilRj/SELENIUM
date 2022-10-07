package FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileOutputStream {

    public static void main(String[] args) throws IOException {

        String location = "Usingfos.txt";
        String content = "This Code is Written by Ezhil and Learned by LAO";

        FileOutputStream fos = new FileOutputStream(location);
        byte[] getcont =content.getBytes();
        fos.write(getcont);
        fos.close();

    }
}