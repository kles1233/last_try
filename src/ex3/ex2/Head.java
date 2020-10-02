package ex3.ex2;

public class Head {
    public String name;
    public String forma;


    public Head (String name, String forma) {
        this.name = name;
        this.forma = forma;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Head =>" +
                " Name=" + name +
                ", Form of head =" + forma +
                '}';


    }
}
