package ex3.ex3;


public class Book {
    public double x;
    public double y;
    public String author;
    public String  name;
    public int age;


    public Book (String name, String author , int age) {
        this.name = name;
        this.author = author;
        this.age= age;
    }

    public void Author(String name, String author) {
System.out.println("Великий писатель " + author.toUpperCase()
        + " написал замечальное произведение "
        +name.toUpperCase());
    }


    public int Year(int age){

        return 2020 - age;
    }

    public void Age(int age) {

        System.out.println("книга была написанна в "
            + age
            + " и ее возраст составляет" + " " + Year(age) + " лет" );}


}
