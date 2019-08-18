package za.co.diputu.view;

import java.util.Scanner;
import za.co.diputu.model.*;
import za.co.diputu.model.StartGame;

public class GameTokens {
    public String array[] = {"North", "East", "West", "South"};
    public  int index;
    public String command;
    public GameTokens(){GameTokens();}
    public void GameTokens() {
        Scanner obj = new Scanner(System.in);
        int i = 1;
        int numberofItems = array.length;
        System.out.println("Choose your move:");
        for (int x = 0; x < numberofItems;x++)
        {
            String coordinates = array[x];
            System.out.println("["+ i + "]" + coordinates);
            i++;
        }
        index = Integer.parseInt(obj.nextLine());
        command = array[index - 1];
        System.out.println(command);
    }
}