package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return 4 * this.length;
    }

    //    @Override
//    public double getPerimeter() {
//        return 4 * super.width;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(super.width, 2);
//    }


}
