package shapes;

    public abstract class Quadrilateral extends Shape implements Measurable {

        protected double length;
        protected double width;

        public Quadrilateral(double num1, double num2) {
            this.length = num1;
            this.width = num2;
        }

        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override
        public double getArea() {
            return 0;
        }

        public abstract void setLength(double length);

        public abstract void setWidth(double width);

    }
