package za.co.diputu.model;

import za.co.diputu.view.SelectHero;

import java.util.Scanner;

public class Game {
    private static int mapDem;
    public static int getMapDem()
    { return mapDem; }
    public int a;
    public static void setMapDem(int mapValue)
    { mapDem = mapValue; }

    public String array[] = {"North", "East", "West", "South"};
    int index;
    public String command;

    public void GameValues() {
        SelectHero w = SelectHero.getSelectHero();
        String oo = w.Hero;
        System.out.println("A value: " + oo);
        int Level = w.LevelValue;
        System.out.println("A number: " + Level);

        Game.setMapDem((Level - 1) * 5 + 10 - (Level % 2));
        a = Game.getMapDem();
        mapDem = (Level - 1) * 5 + 10 - (Level % 2);
        System.out.println("Map Dimension: " + mapDem);
    }

    public void GameToken() {
        Scanner obj = new Scanner(System.in);
        int i = 1;
        int numberofItems = array.length;
        int x = this.mapDem / 2;
        int y = this.mapDem / 2;
        while (true) {
            System.out.println("Choose your move:");

                for (int j = 0; j < numberofItems; j++)
                {
                    String coordinates = array[j];
                    System.out.println("[" + (j + 1) + "]" + coordinates);
                }
                 index = Integer.parseInt(obj.nextLine());
                if (index >= 1 && index <= 4)
                {
                        command = array[index - 1];
                        if (mapDem > x || mapDem > y)
                        {
                            int move;
                            if (command.equals("North")) {
                                move = y + 3;
                                System.out.println(move);
                            } else if (command.equals("East")) {
                                move = x - 3;
                                System.out.println(move);
                                x++;
                            } else if (command.equals("West")) {
                                 move = x + 3;
                                System.out.println(move);
                                x++;
                            } else if (command.equals("South")) {
                                move = y - 3;
                                System.out.println(move);
                                y--;
                            }
                            x++;
                        }
                }
        }
    }

//    public void navigation()
//    {
//        int x = this.mapDem / 2;
//        int y = this.mapDem / 2;
//        System.out.println("Point x: " + x);
//            if (command.equals("North")) {
//                int move = y + 2;
//                System.out.println(move);
//                while (true)
//                {
//                    move++;
//                }
//            } else if (command.equals("East")) {
//                int move = x - 3;
//                move++;
//                System.out.println(move);
//            } else if (command.equals("West")) {
//                int move = x + 3;
//                move++;
//                System.out.println(move);
//            } else if (command.equals("South")) {
//                int move = y - 2;
//                System.out.println(move);
//            }
//        }
}
