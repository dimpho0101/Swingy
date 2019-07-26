package za.co.diputu.view;

public class MainWindow {
    public  void  theStart()
    {
        NewHero create = new NewHero();
        create.SetHero();
        System.out.println("-------");
        SelectHero select = new SelectHero();
        select.SelectHeroConsole();

    }
}
