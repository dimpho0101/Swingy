package za.co.diputu.view;


import za.co.diputu.util.Helpers;
import za.co.diputu.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectHero {
    public int LevelValue;

    //HeroValue Singleton
    private static SelectHero selectHero = null;

    private SelectHero(){
    }

    public static SelectHero getSelectHero()
    {
        if (selectHero == null) {
            selectHero = new SelectHero();
        }
        return selectHero;
    }

    public String Hero;
    private static String HeroValue;
    public static String getHeroValue()
    { return HeroValue; }
    public static void setHeroValue(String a){HeroValue = a;}

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
                    SelectHero.setHeroValue(z[0]);
                    Hero = SelectHero.getHeroValue();
//                    HeroValue = z[0];
                    System.out.println( "You selected " + Hero + " as your hero");
                    LevelValue = Integer.parseInt(z[2]);
                }
                u++;
            }
    }


}