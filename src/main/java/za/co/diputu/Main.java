package za.co.diputu;

import za.co.diputu.model.Game;
import za.co.diputu.view.SelectHero;

public class Main {
    public static void main(String[] args) {
        SelectHero select = new SelectHero();
        select.SelectHeroConsole();

        Game game = new Game();
        game.Reader();


    }
}
