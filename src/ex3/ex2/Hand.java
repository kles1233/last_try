package ex3.ex2;

public class Hand {
    public String name1;
    public int count;


    public Hand(String name1, int count) {
        this.name1 = name1;
        this.count = count;
    }


    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String toString() {
        return "Hand =>" +
                " Name=" + name1 +
                ", Count fingers=" + count +
                '}';
    }

}