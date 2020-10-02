package ex5;

    public abstract class Shape {

        protected double area; //not private, we want sub-classes to see this field
        protected String color;
        public Shape(double area) {
            this.area = area;
        }

        public Shape(String color) {
            this.color = color;
        }

        public Shape() {

        }

        public abstract double getPerimiter();
        public abstract double getArea();
        public abstract String toString();
    }

