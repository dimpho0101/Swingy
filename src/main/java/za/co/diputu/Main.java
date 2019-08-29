package za.co.diputu;

import za.co.diputu.model.Game;
import za.co.diputu.view.GameTokens;
import za.co.diputu.view.NewHero;
import za.co.diputu.view.SelectHero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        while (true)
        {
            SelectHero w = SelectHero.getSelectHero();
            NewHero player = new NewHero();
            System.out.println("Select a hero, select s" +  " | " + "Create a hero, select c");
            String s = obj.nextLine();
            String c = obj.nextLine();
            if (s.equals("s"))
            {
                w.selectHero();
            }
            else if (c.equals("c"))
            {
                player.SetHero();
            }
//            game.GameToken();
            break;
        }
        Game game = new Game();
        game.GameValues();
        game.GameToken();
    }
}
