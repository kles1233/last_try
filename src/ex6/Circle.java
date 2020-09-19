package ex6;

import ex5.Shape;

public class Circle extends Shape {
    protected double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double getPerimiter() {
            return 3.14 * radius*2;
        }

        public double getArea() {
            return 3.14*radius*radius;
        }


        public String toString() {
            return "Circle" +
                    "radius=" + radius
                    + "Perimetr " + getPerimiter()
                    + " Area "  + getArea();

        }
}
