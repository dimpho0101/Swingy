package za.co.diputu.view;

import java.util.Scanner;

public class SelectAction {

    Scanner obj = new Scanner(System.in);

    public void SelectActionX()
    {
        System.out.println("....");
        NewHero player = new NewHero();
        SelectHero x = new SelectHero();

       while (true) {
           System.out.println("Select a hero, select s" +  " | " + "Create a hero, select c" );
           String s = obj.nextLine();
           String c = obj.nextLine();
           if (s.equals("s")) {
               x.SelectHeroConsole();
           } else if (c.equals("c")) {
               player.SetHero();
           }
           break;
       }
    }
}
