package za.co.diputu.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayMission {
    Scanner n = new Scanner(System.in);

    public void StartMission()
    {

    }

    public void StartOption(){
        String obj = n.nextLine();
        if (obj == "1")
        {

        }
        System.out.println("Press 1 to start game");
    }

    public void ExitGame(){
        System.exit(0);
    }
}