package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());


        Measurable myShape;
        myShape = new Square(11.0);
        System.out.println("The area of this square is: " + myShape.getArea());
        System.out.println("The perimeter of this square is: " + myShape.getPerimeter());

        myShape = new Rectangle(85.0, 132.0);
        System.out.println("The area of this rectangle is: " + myShape.getArea());
        System.out.println("The perimeter of this rectangle is: " + myShape.getPerimeter());

        }

    }


