package za.co.diputu;

import za.co.diputu.controller.NewHeroController;
import za.co.diputu.model.Game;
import za.co.diputu.model.newHeroModel;
import za.co.diputu.view.GameTokens;
import za.co.diputu.view.NewHero;
import za.co.diputu.view.SelectHero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner obj = new Scanner(System.in);
        newHeroModel model = retrieve();

        NewHero view = new NewHero();
        NewHeroController controller = new NewHeroController(model, view);
        controller.updateView();
//        controller.setHeroName("Panadas");
//        controller.updateView();

//        while (true)
//        {
//            SelectHero w = SelectHero.getSelectHero();
//            NewHero player = new NewHero();
//            System.out.println("Select a hero, select s" +  " | " + "Create a hero, select c");
//            String s = obj.nextLine();
//            String c = obj.nextLine();
//            if (s.equals("s"))
//            {
//                w.selectHero();
//            }
//            else if (c.equals("c"))
//            {
//                player.SetHero();
//            }
//            break;
//        }
//        Game game = new Game();
//        game.GameValues();
//        game.GameToken();
    }

    private static newHeroModel retrieve()
    {
        Scanner obj = new Scanner(System.in);
        newHeroModel m = new newHeroModel();
        System.out.println("Insert Hero Name: ");
        m.setUserName(obj.nextLine());
        System.out.println("Insert Hero Type: ");
        m.setType(obj.nextLine());
        System.out.println("Insert Hero Level: ");
        int Lvl = Integer.parseInt(obj.nextLine());
        if (Lvl > 1)
        {
            System.out.println("You are creating a hero, you cannot have a level higher than 1");
        }
        System.out.println("Insert Hero Weapon: ");
        m.setWeapon(obj.nextLine());
        return m;
    }
}
