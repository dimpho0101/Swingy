package za.co.diputu.view;

import za.co.diputu.view.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static za.co.diputu.view.Logger.print;
import static za.co.diputu.view.Logger.read;

public class NewHero{
    String userName;
    String type;
    int Level;
    int points;
    String weapon;
    String armor;
    String fileName = "/goinfre/diputu/Desktop/Swingy/Heroes.txt";
    public void SetHero()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Create Hero");
        userName = obj.nextLine();
        type = obj.nextLine();
        Level = Integer.parseInt(obj.nextLine());
        points = Integer.parseInt(obj.nextLine());
        weapon = obj.nextLine();
        armor = obj.nextLine();
        print(userName + "," + type + ","+ Level +","+ points + "," + weapon + "," + armor);
        System.out.println(userName + " Has been added as a hero");
//        read();
    }
}

