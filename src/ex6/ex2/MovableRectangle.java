package ex6.ex2;

import ex5.Rectangle;


    public class MovableRectangle extends Rectangle  implements Movable {
        private final MovablePoint center;
        public MovableRectangle(String color, int x, int y) {

            super(color,x,y);

            center = new MovablePoint(x, y);
        }

        @Override
        public void move(int right, int down) {
            center.move(right, down);
        }
    }

