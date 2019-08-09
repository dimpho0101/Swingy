package za.co.diputu.model;

import za.co.diputu.model.characters.Hero;
import za.co.diputu.view.SelectHero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Hero hero = new Hero();
    int lvl = hero.level;
    Scanner obj = new Scanner(System.in);
    String levelnum;
    public void Reader() {

        SelectHero w = new SelectHero();
        w.SelectHeroConsole();
        String Hero = w.HeroValue;

        String fileName =  "/goinfre/diputu/Desktop/Swingy/Hereos.txt";

        String line = null;

        try {
            FileReader fileReader =
                    new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            List<String[]> x = new ArrayList<>();
            while((line = bufferedReader.readLine()) != null) {
                x.add(line.split(","));
            }

//            System.out.println(Hero);
//        ////////   /////// //////////////////////////////////////////////////////////////////
//            for (String[] array : x){
//               if (array[0] == )
//            }
            for (String [] z : x)
                {
                    levelnum = z[2];
                    System.out.println(levelnum);
                }


//            System.out.println(parsedNum);
//        lvl = (parsedNum - 1) * 5 + 10 - (parsedNum % 2);
//        System.out.println(lvl);
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }
}
