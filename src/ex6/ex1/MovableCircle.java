package ex6.ex1;
import ex5.Circle;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint center;
    public MovableCircle(String color, double radius, int x, int y) {
        super(color, radius);
        center = new MovablePoint(x, y);
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
}