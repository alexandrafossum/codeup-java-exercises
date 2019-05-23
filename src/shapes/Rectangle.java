package shapes;

public class Rectangle extends Quadrilateral {

//    protected double length;
//    protected double width;

    public Rectangle(double width, double length) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

//        this.width = width;
//        this.length = length;
//    }
//
//        public double getArea () {
//            return this.length * this.width;
//        }
//
//        public double getPerimeter () {
//            return (2 * this.length) + (2 * this.width);
//        }
//
//        public double getWidth () {
//            return width;
//        }
//
//        public double getLength () {
//            return length;
//        }

}
