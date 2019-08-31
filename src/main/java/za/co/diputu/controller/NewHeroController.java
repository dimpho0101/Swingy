package za.co.diputu.controller;

import za.co.diputu.model.newHeroModel;
import za.co.diputu.view.NewHero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewHeroController {
    private newHeroModel model;
    private NewHero view;

    public NewHeroController(newHeroModel model, NewHero view)
    {
        this.model = model;
        this.view = view;
    }

    public void setHeroName(String userName)
    {
        model.setUserName(userName);
    }

    public String getHeroName()
    {
        return model.getUserName();
    }

    public void setType(String type)
    {
        model.setType(type);
    }

    public String getType()
    {
        return model.getType();
    }

    public void setLevel(int Level) { model.setLevel(Level); }

    public int getLevel()
    {
        return model.getLevel();
    }

    public void setPoints(int points)
    {
        model.setPoints(points);
    }

    public int getPoints()
    {
        return model.getPoints();
    }

    public void setWeapon(String weapon)
    {
        model.setWeapon(weapon);
    }

    public String getWeapon()
    {
        return  model.getWeapon();
    }

    public void updateView()
    {
        view.SetHero(model.getUserName(), model.getType(), model.getLevel(), model.getPoints(), model.getWeapon());
    }
}
