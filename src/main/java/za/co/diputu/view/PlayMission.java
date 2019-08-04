package za.co.diputu.view;

import java.util.ArrayList;
import java.util.List;
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
//        coordinates.forEach((n) -> System.out.println(n));
        for (i= 0;i < 4;i++)
        {
            System.out.println("[" + i + "]" + coordinates.get(i));
            System.out.println("yooo");
        }
        index = Integer.parseInt(n.nextLine());

        int u = 0;
        for (String z : coordinates){
            coordinates
//            if (index == u) {
                System.out.println();
//            }
        }

        if (index == i){
            System.out.println(coordinates.get(i));
        }

    }

    public void StartOption(){
        System.out.println("Press 1 to start game");
        String obj = n.nextLine();
        if (obj == "1")
        {

            System.out.println("yooo");
        }
    }

    public void ExitGame(){
        System.exit(0);
    }
}