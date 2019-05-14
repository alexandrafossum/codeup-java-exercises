import java.util.*;


public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int a = 5;
//
//        while (a <= 15) {
//            System.out.println(a++);
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
//
//        System.out.println("************");
//
//        for (int i = 5; i <=15; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("************");
//
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//
//        System.out.println("************");
//
//        for (int i = 100; i > -10; i -=5) {
//            System.out.println(i);
//        }

        //FIZZBUZZ

//        int b = 1;
//
//        for (b = 1; b <= 100; b++) {
//            if ((b % 15) == 0) {
//                System.out.println("fizzbuzz");
//            } else if ((b % 3) == 0) {
//                System.out.println("fizz");
//            } else if ((b % 5) == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(b);
//            }
//        }


        //TABLE OF POWERS

        System.out.println("Want to do this thing?");

        String affirmative = sc.next();

        if (affirmative.equalsIgnoreCase("yes")) {

            System.out.println("What number would you like to go up to?");
            int numPrompt = sc.nextInt();

            System.out.println("Here is your table!");

            System.out.println("Number");

            for (int i = 1; i <= numPrompt; i++) {
                System.out.println(i);
            }

            System.out.println("Squared");

            for (int i = 1; i <= numPrompt; i++) {
                System.out.println(i * i);
            }

            System.out.println("Cubed");
            for (int i = 1; i <= numPrompt; i++) {
                System.out.println(Math.pow(i, 3));
            }
        } else {
            System.out.println("Sorry, we can't continue without your consent.");
        }


        //CONVERT GIVEN NUMBER TO LETTER GRADES

        System.out.println("Enter a number between 0 and 100");
        int numberGrade = sc.nextInt();

            if (numberGrade > 88) {
                System.out.println("A");
            } else if (numberGrade >= 80) {
                System.out.println("B");
            } else if (numberGrade >= 67) {
                System.out.println("C");
            } else if (numberGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }



    }
}
