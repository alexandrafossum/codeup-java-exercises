package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle circumference: " + circle.getCircumference());
    }

}
