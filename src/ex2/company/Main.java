package ex2.company;

import java.util.Arrays;
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

        Dog dog1 = new Dog("Mike", 2);
        Dog dog2 = new Dog("Helen", 7);


        Pitomnik(args);
    }


    public static void Pitomnik (String[] args) {
        Pitomnik dogs = new Pitomnik();
        Dog dog1 = new Dog("Mike", 2);
        Dog dog2 = new Dog("Helen", 7);
        Dog dog3 =new Dog ("Piker", 6);
        Dog dog4 =new Dog ("Kiker", 10);
        dogs.addDog(dog1);
        dogs.addDog(dog2);
        dogs.addDog(dog3);
        dogs.addDog(dog4);
        System.out.println(Arrays.toString(dogs.list()));
    }
}