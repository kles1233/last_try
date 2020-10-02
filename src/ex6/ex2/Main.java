package ex6.ex2;


public class Main {
    public static void main(String[] args) {
        Movable s = new MovableRectangle("black", 90, 120);
        System.out.println(s);
        s.move(30, -70);
        System.out.println(s);
    }
}