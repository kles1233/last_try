package ex3.ex1;
import java.util.Random;


// 3
public class Main {

    public static void main(String[] args) {


        Circle Circle = new Circle(60);
        double radius = Circle.getRadius();
        System.out.println(radius);
        Circle.setRadius(40);
        System.out.println(Circle.getRadius());
        System.out.println(Circle);

    }
}
