package za.co.diputu.model;

import za.co.diputu.model.characters.Hero;
import za.co.diputu.util.GetSet;
import za.co.diputu.util.Helpers;
import za.co.diputu.view.SelectHero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
//
//    Hero hero = new Hero();
//    Scanner obj = new Scanner(System.in);
//    String levelnum;

//    private static int mapDem;
//    public static int getMapDem()
//    { return mapDem; }
//    public int a;
//    public static void setMapDem(int mapValue)
//    { mapDem = mapValue; }

//    public Game(){ Reader(); }

    public void GameValues() {
        SelectHero w = new SelectHero();
        String oo = w.Hero;
        System.out.println("A value: " + oo);
//        String Hero = w.HeroValue;
//        int Level = w.LevelValue;
//        List<String[]> x = Helpers.getHeroes();
//            int i = 0;
//            for (String[] z : x) {
//                System.out.println(Hero);
//                levelnum = z[2];
//                System.out.println(Level);
//                Game.setMapDem((Level - 1) * 5 + 10 - (Level % 2));
//                a = Game.getMapDem();
////                mapDem = (Level - 1) * 5 + 10 - (Level % 2);
//                System.out.println(mapDem);
//                break;
//            }
    }
}
