package za.co.diputu.model;

import za.co.diputu.view.SelectHero;

public class GameSingleton {
    private static GameSingleton single = null;
    public String s;
    private GameSingleton(){
        SelectHero x = new SelectHero();
        String HeroName = x.HeroValue;
        System.out.println(HeroName);
    }

    public static GameSingleton getInstance()
    {
        if (single == null)
            single = new GameSingleton();
        return single;
    }

    public void gameSingle()
    {
        GameSingleton x = GameSingleton.getInstance();
        System.out.println("The tongue twirling: " + x.s);
    }

//    public static void main(String args[]){
//        GameSingleton x = new GameSingleton();
//        x.gameSingle();
//    }
}
