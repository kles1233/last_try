package ex3.ex1;
import java.util.Random;


// 3
public class Main {

    public static void main(String[] args) {


        Circle o1 = new Circle();

        o1.printCircle();

        o1.x = 3;

        o1.r = 12.3;

        o1.printCircle();


        Circle o2 = new Circle();

        o2.r = 3.14;

        o2.zoomCircle(1.66);

        o2.printCircle();

    }
}
