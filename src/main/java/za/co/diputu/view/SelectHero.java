package za.co.diputu.view;


import za.co.diputu.util.Helpers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectHero {
    public String HeroValue;
    public int LevelValue;

    public SelectHero(){
        selectHero();
    }

    public void selectHero()
    {
        Scanner obj = new Scanner(System.in);
        int index;

        List<String[]> x = Helpers.getHeroes();


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
                    HeroValue = z[0];
                    System.out.println( "You selected " + HeroValue + " as your hero");
                    LevelValue = Integer.parseInt(z[2]);
                }
                u++;
            }
    }

}