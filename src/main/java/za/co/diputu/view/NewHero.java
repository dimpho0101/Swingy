package za.co.diputu.view;

import java.util.Scanner;

import static za.co.diputu.view.Logger.print;

public class NewHero
{
//    String userName;
//    String type;
//    int Level;
//    int points;
//    String weapon;
//    String armor;

    public NewHero(){}

    public void SetHero(String userName, String type, int Level, int points, String weapon)
    {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Create Hero Name: " + userName);
////        userName = obj.nextLine();
//        System.out.println("Insert Hero Type: " + type);
////        type = obj.nextLine();
//        System.out.println("Insert Hero Level: " + Level);
//        System.out.println("Insert Hero Points: " + points);
//        outerloop:
//            if (Level > 1)
//            {
//                System.out.println("You are creating a hero, you cannot have a level higher than 1");
//                break outerloop;
//            } else if (points > 0) {
//                System.out.println();
//            }
//        System.out.println("Insert Hero Weapon: " + weapon);
//
        print(userName + "," + Level + "," + type + "," + Level + "," + points + "," + weapon);// + "," + type + ","+ 1 +","+ 0 + "," + weapon + "," + armor);
        System.out.println(userName + " Has been added as a hero");
    }

}

