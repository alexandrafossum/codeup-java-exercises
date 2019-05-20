package shapes;

public class Circle {

    private double radius;

    public Circle(double radiusInput) {
        this.radius = radiusInput;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
