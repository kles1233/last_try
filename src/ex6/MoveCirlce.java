package ex6;

public class MoveCirlce extends  Circle implements Moveable {
    private Point center;
    public MoveCirlce(String color, double raduis, int x, int y){
        super(color, radius);
        center = new Point(x,y);
    }

}
