package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

    public static void main(String[] args) throws IOException {

        String Filelocation = "UsingBufferedWritter.txt";
        FileReader fileread = new FileReader(Filelocation);

        BufferedReader bufferedReader = new BufferedReader(fileread);

        String currentline;
        while ((currentline = bufferedReader.readLine()) != null) {

            System.out.println(currentline);


        }


    }


}
