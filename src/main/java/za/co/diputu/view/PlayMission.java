package za.co.diputu.view;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayMission {
    Scanner n = new Scanner(System.in);


    public void StartMission()
    {
        ArrayList<String> coordinates = new ArrayList<String>();
        int index;
        int i;

        coordinates.add("North");
        coordinates.add("East");
        coordinates.add("West");
        coordinates.add("South");
        for (i= 0;i < 4;i++)
        {
            System.out.println("[" + i + "]" + coordinates.get(i));

        }
        index = Integer.parseInt(n.nextLine());
        System.out.println(coordinates.get(index));

    }

    public void StartOption(){
        int index;
        System.out.println("Press 1 to start game");
        index = Integer.parseInt(n.nextLine());
        if (index == 1)
        {
          StartMission();
        }
    }

    public void ExitGame(){
        System.exit(0);
    }
}