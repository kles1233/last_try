package ex3.ex2;

public class Human {
    private Head Head;
    private Leg Leg;
    private Hand Hand;
    public Human(Head Head, Leg Leg, Hand Hand){
        this.Head = Head;
        this.Leg = Leg;
        this.Hand = Hand;
    }
    @Override
    public String toString() {
        return "Human{" +
                "Head=" + Head +
                ", Leg=" + Leg +
                ", Hand=" + Hand +
                '}';
    }
}
