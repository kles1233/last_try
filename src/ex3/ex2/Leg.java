package ex3.ex2;

public class Leg {
    public String name3;
    public int count1;


    public Leg(String name3, int count1) {
        this.name3 = name3;
        this.count1 = count1;
    }


    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public int getCount1() {
        return count1;
    }

    public void setCount1(int count1) {
        this.count1 = count1;
    }

    @Override
    public String toString() {
        return "Leg =>" +
                " Name=" + name3 +
                ", Count fingers =" + count1 +
                '}';


    }

}