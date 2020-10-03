package ex6.ex1;
import ex5.Circle;

import java.awt.*;

public class MovableCircle extends Circle implements Movable {
    private Point center;
    public MovableCircle(double radius,String color, int x, int y) {
        super(color, radius);
        center = new Point(x, y);
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
    }