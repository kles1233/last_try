package ex5;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width=width;
        this.length=length;
    }

    public Rectangle(String color) {
        super(color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double getPerimiter() {
        return 2*width+2*length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Perimetr=" + getPerimiter() +
                ", area=" + getArea() +
                '}';
    }
}
