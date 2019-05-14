import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//
//        System.out.println("************");
//
//        int y = 100;
//
//        do {
////            System.out.println(y += 2);
//            System.out.println(y -= 5);
//        } while (y < 100 && y > -5);
//
//        System.out.println("************");
//
//        long x = 2;
//
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x <= 1000000);

        System.out.println("************");

        for (int i = 5; i <=15; i++) {
            System.out.println(i);
        }

        System.out.println("************");

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        System.out.println("************");

        for (int i = 100; i > -10; i -=5) {
            System.out.println(i);
        }



    }
}
