import java.util.*;


public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int a = 5;

        while (a <= 15) {
            System.out.println(a);
            a++;
        }

        System.out.println("************");

//        int b = 0;
//
//        do {
//            if (b % 2 == 0) {
//                System.out.println(b);
//            }
//
//        } while (b <= 100);

        System.out.println("************");

        int c = 100;

        do {
            System.out.println(c -= 5);
        } while (c >= -5);

        System.out.println("************");

        long d = 2;

        do {
            System.out.println(d);
            d *= d;
        } while (d <= 1000000);

        System.out.println("************");

        for (int e = 5; e <= 15; e++) {
            System.out.println(e);
        }

        System.out.println("************");

        for (int f = 0; f <= 100; f += 2) {
            System.out.println(f);
        }

        System.out.println("************");

        for (int g = 100; g > -10; g -=5) {
            System.out.println(g);
        }

        System.out.println("************");

        for (long h = 2; h < 1000000; h *= h) {
            System.out.println(h);
        }

        System.out.println("************");

        //FIZZBUZZ

        for (int i = 1; i <= 100; i++) {
            if ((i % 15) == 0) {
                System.out.println("fizzbuzz");
            } else if ((i % 5) == 0) {
                System.out.println("buzz");
            } else if ((i % 3) == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }


        //TABLE OF POWERS

        System.out.println("Want to do this thing?");

        String affirmative = sc.next();

        if (affirmative.equalsIgnoreCase("yes")) {

            System.out.println("What number would you like to go up to?");
            int numPrompt = sc.nextInt();

            System.out.println("Here is your table!");

            System.out.println("Number | Squared | Cubed");
            System.out.println("-------|---------|------");

            for (int j = 1; j <= numPrompt; j++) {
                int squared = j * j;
                int cubed = j * j * j;
                System.out.printf("%-7d| %-9d|%-6d%n", j, squared, cubed);
            }
        } else {
            System.out.println("Sorry, we can't continue without your consent.");
        }


        //CONVERT GIVEN NUMBER TO LETTER GRADES


        System.out.println("Do you want to continue?");
        String userAnswer = sc.next();

        if (userAnswer.equalsIgnoreCase("yes")) {

            System.out.println("Enter a number between 0 and 100");
            int numberGrade = sc.nextInt();

            if (numberGrade >= 88) {
                System.out.println("A");
            } else if (numberGrade >= 80) {
                System.out.println("B");
            } else if (numberGrade >= 67) {
                System.out.println("C");
            } else if (numberGrade >= 60) {
                System.out.println("D");
            } else if (numberGrade >= 0){
                System.out.println("F");
            }

        } else {
            System.out.println("Sorry, you didn't give your consent");
        }



    }
}
