package za.co.diputu.model;

public class newHeroModel {
    private String userName;
    private String type;
    private int Level;
    private int points;
    private String weapon;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type) { this.type = type; }

    public int getLevel() { return Level; }

    public void setLevel(int Level)
    {
        this.Level = Level;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }
}
