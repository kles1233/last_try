package ex5;

public class square extends Rectangle {
    private double side;

    public square(String color, double side) {
        super(color);
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimiter() {
        return 2*side;
    }

    @Override
    public double getArea() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Perimetr=" + getPerimiter() +
                ", Area=" + getArea() +
                '}';
    }
}
