package ex3.ex3;

import java.io.IOException;

public class Book {
    public String author;
    public String  name;
    public int age;


    public Book (String name, String author , int age) {
        this.name = name;
        this.author = author;
        this.age= age;
    }

    public void Author() throws IOException {
int a;
a = System.in.read();
        System.out.println("Введите автора - " + a);

    }
}
