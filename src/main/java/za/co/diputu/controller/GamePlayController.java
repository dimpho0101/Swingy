package za.co.diputu.controller;

import za.co.diputu.model.Game;
import za.co.diputu.view.SelectHero;

public class GamePlayController {
    private Game model;
    private SelectHero view;

    public GamePlayController(Game model, SelectHero view)
    {
        this.model = model;
        this.view = view;

    }
}
