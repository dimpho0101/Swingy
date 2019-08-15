package za.co.diputu.view;

import java.util.Scanner;

public class GameTokens {
    public void GameTokens() {
        Scanner obj = new Scanner(System.in);
        int index;
        int i = 1;
        String array[] = {"North", "East", "West", "South"};
        int numberofItems = array.length;
        System.out.println("Choose your move:");
        for (int x = 0; x < numberofItems;x++)
        {
            String coordinates = array[x];
            System.out.println("["+ i + "]" + coordinates);
            i++;
            index = Integer.parseInt(obj.nextLine());
            int c = 0;
            if (index == c)
            {
                String yo = array[x];
            }
        }
    }
}
