package za.co.diputu.view;

import java.io.*;
import za.co.diputu.view.NewHero;

public class Logger {

    public static void print(String args) {

        try (FileWriter writer = new FileWriter("Hereos.txt", true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("\n" + args + "\n");
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

    }

    public static void read(String[] args) throws Exception
    {
        File file = new File("/goinfre/diputu/Desktop/Swingy/Hereos.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
