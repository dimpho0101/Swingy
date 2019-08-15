package za.co.diputu.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Helpers {
    public static List<String[]> getHeroes(){
        // The name of the file to open.
        String fileName = "/goinfre/diputu/Desktop/Projects/Hereos.txt";
        // This will reference one line at a time
        String line = null;
        List<String[]> x = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {

                x.add(line.split(","));
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return x;
    }
}
