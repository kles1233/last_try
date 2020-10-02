package ex3.ex2;

public class HumanTest {
    public static void main(String[] args) {
        Hand Hand = new Hand("Valera", 10);
        Leg Leg = new Leg("Vova ", 21);
        Head Head = new Head("Gena", "circle");
        Human Human = new Human(Head, Leg, Hand);
        System.out.println(Human);
    }
}