package za.co.diputu.view;

import java.util.Scanner;

import static za.co.diputu.view.Logger.print;

public class NewHero
{
    String userName;
    String type;
    int Level;
    int points;
    String weapon;
    String armor;
    String fileName = "/goinfre/diputu/Desktop/Swingy/Heroes.txt";

    public NewHero(){}

    public void SetHero()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Create Hero Name:");
        userName = obj.nextLine();
        System.out.println("Insert Hero Type:");
        type = obj.nextLine();
        System.out.println("Insert Hero Level:");
        Level = Integer.parseInt(obj.nextLine());
        System.out.println("Insert Hero Points");
        points = Integer.parseInt(obj.nextLine());
        outerloop:
            if (Level >= 1)
            {
                System.out.println("You are creating a hero, you cannot have a level higher than 1");
                break outerloop;
            } else if (points > 0) {
                System.out.println("You are creating a hero, you have zero points");
            }
        System.out.println("Insert Hero Weapon");
        weapon = obj.nextLine();
        System.out.println("Insert Hero Armor");
        armor = obj.nextLine();
        print(userName + "," + type + ","+ 1 +","+ 0 + "," + weapon + "," + armor);
        System.out.println(userName + " Has been added as a hero");
    }

}

