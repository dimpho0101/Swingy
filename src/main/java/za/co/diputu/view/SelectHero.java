package za.co.diputu.view;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectHero {
    public void SelectHeroConsole()
    {
        // The name of the file to open.
        String fileName = "/goinfre/diputu/Desktop/Swingy/Hereos.txt";

        // This will reference one line at a time
        String line = null;
        Scanner obj = new Scanner(System.in);
        int index;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            List<String[]> x = new ArrayList<>();
            while((line = bufferedReader.readLine()) != null) {

                x.add(line.split(","));
            }
            int i = 1;
            for (String[] array : x){
                    System.out.println("["+ i + "]"+ array[0]);
                    i++;
            }
            index = Integer.parseInt(obj.nextLine());
            if(index == i)
            {
                System.out.println(x + "your hero");
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
