package za.co.diputu.model;

public class Coordinates {

    private static int x;
    private static int y;
    public Coordinates(){}
    public Coordinates(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

}
