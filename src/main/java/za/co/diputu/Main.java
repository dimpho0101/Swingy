package za.co.diputu;

import javax.swing.*;

import za.co.diputu.controller.CharacterController;
import za.co.diputu.view.*;

public class Main {

    public static void main(String[] args) {
        NewHero theView = new NewHero();
        theView.SetHero();
    }
}
