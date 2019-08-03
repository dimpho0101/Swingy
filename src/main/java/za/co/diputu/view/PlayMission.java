package za.co.diputu.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayMission {
    Scanner n = new Scanner(System.in);

    public void StartMission()
    {
//        String[] coordinates = {"North", "East", "West", "South"};
        ArrayList<String> coordinates = new ArrayList<String>();
        int i= 1;

        coordinates.add("North");
        coordinates.add("East");
        coordinates.add("West");
        coordinates.add("South");
//        coordinates.forEach((n) -> System.out.println(n));
        for (String x : coordinates){
            System.out.println("[" + i + "]" + coordinates);
        }
    }

    public void StartOption(){
        String obj = n.nextLine();
        if (obj == "1")
        {
            StartMission();
        }
        System.out.println("Press 1 to start game");
    }

    public void ExitGame(){
        System.exit(0);
    }
}