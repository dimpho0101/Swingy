package za.co.diputu.view;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectHero {
    public String HeroValue;
    public void SelectHeroConsole()
    {
        // The name of the file to open.
        String fileName = "/goinfre/diputu/Desktop/Projects/Hereos.txt";

        // This will reference one line at a time
        String line = null;
        Scanner obj = new Scanner(System.in);
        int index;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String[]> x = new ArrayList<>();
            while((line = bufferedReader.readLine()) != null) {

                x.add(line.split(","));
            }
            System.out.println("Select a hero");
            int i = 1;
            for (String[] array : x){
                    System.out.println("["+ i + "]"+ array[0] +"| "+ array[1] + "| " + array[2] + "| " + array[3] + "| " + array[4]);
                    i++;
            }
            index = Integer.parseInt(obj.nextLine());
            int u = 0;
            for (String [] z : x)
            {
                if (index ==  u + 1)
                {
                   HeroValue = z[1];
                    System.out.println( "You selected " + HeroValue + " as your hero");
                }
                u++;
            }


            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
                System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }

}