package za.co.diputu.model;

import za.co.diputu.view.GameTokens;

public class StartGame {
    public int w;
    public int m;
    public void StartGame()
    {
        Game point = new Game();
        int num = point.mapDem;
        System.out.println(num);
        Coordinates x = new Coordinates();
        x.setX(num / 2);
        x.setY(num / 2);
        w = x.getX();
        m = x.getY();
        System.out.println("X coordinate: " + w);
    }

    public void navigation()
    {
        StartGame start = new StartGame();
        GameTokens x = new GameTokens();
        String command = x.command;
        if (command.equals("North"))
        {
           int i = w + 2;
        }
        System.out.println("Choosen coordinates: " + command);
    }
}
