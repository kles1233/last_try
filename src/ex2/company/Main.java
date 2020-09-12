package ex2.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Ball ball = new Ball("Nike ball", 12);
    Book book = new Book("Shrek book",90);
        System.out.println(ball.name);
        System.out.println(ball.weight);
        System.out.println(book.name1);
        System.out.println(book.count);

        //////////////////////////////

        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);

        System.out.println(d1);
        System.out.println(d2);
        d1.intoHumanAge();
        d2.intoHumanAge();



    }
}