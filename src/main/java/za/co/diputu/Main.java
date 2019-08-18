package za.co.diputu;

import za.co.diputu.model.Game;
import za.co.diputu.model.StartGame;
import za.co.diputu.view.GameTokens;
import za.co.diputu.view.SelectHero;

public class Main {
    public static void main(String[] args) {
        SelectHero select = new SelectHero();
        select.selectHero();

//        StartGame game = new StartGame();
//        game.StartGame();
        Game game = new Game();
        game.GameValues();
//        GameTokens xw = new GameTokens();
//        xw.GameTokens();
//        StartGame x = new StartGame();
//        x.StartGame();
    }
}
