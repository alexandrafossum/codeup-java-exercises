import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition: " + addition(6, 5));
        System.out.println("Subtraction: " + subtraction(110, 76));
        System.out.println("Multiplication: " + multiplication(6, 44));
        System.out.println("Division: " + division(19348, 7));
        System.out.println("Modulus: " + modulus(5, 9));

        System.out.println("---------------------------------------------");

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        getInteger(1, 20);

        System.out.println("---------------------------------------------");
        System.out.println("Factorial");
        factorial();

        System.out.println("---------------------------------------------");

        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            dice();
            System.out.println("Do you want to continue? [Y/N]");
            answer = sc.nextLine();
        }

    }

    /* Create five separate methods. Each will perform an arithmetic
       operation:
       - Addition
       - Subtraction
       - Multiplication
       - Division
       - Modulus
    */

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    /*
    *  Create a method that validates that user input is in a certain range.
    *  The method signature should look like this:
    *           public static int getInteger(int min, int max);
    *  and is used like this:
    *           int userInput = get Integer(1, 10);
    *
    *  If the input is invalid, prompt the user again. Recursion might be a
    *  good idea.
    *
    * */

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        while (userInput < min || userInput > max) {
            System.out.println(userInput + " is out of range!");
            userInput = sc.nextInt();
        }
            System.out.println(userInput + " is within range!");
            return userInput;
    }

    //Walk-through version, recursion

    public static int getInteger2(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Number out of range");
            return getInteger2(min, max);
        }
    }

    //Integer.parseInt(sc.nextLine());

    /*
    * Calculate the factorial of a number.
    *   - Prompt the user to enter an integer from 1 to 10.
    *   - Display the factorial of the number entered by the user.
    *   - Ask if the user wants to continue.
    *   - Use a FOR LOOP to calculate the factorial.
    *   - Use the long type to store the factorial.
    * */

    public static long calcFact (int a) {
        long output = 1;
        for (int i = 1; i < a; i++) {
            output += i;
        }
        return output;
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        boolean userCont;

        do {
            System.out.println("Enter a number between 1 and 10");
            int userInput = sc.nextInt();
            System.out.println("The factorial is " + calcFact(userInput));
            System.out.println("Do you want to do it again?");
            userCont = sc.next().equalsIgnoreCase("yes");
        } while (userCont);
        System.out.println("Goodbye!");
    }

    /*
    * Create an application that simulates dice rolling. Prompt the user to
    * roll the dice. "Roll" two n-sided dice, display the results of each, and
    * then ask the user if they want to roll the dice again. Use STATIC
    * METHODS to implement the method(s) that generate the random numbers.
    * Use the .random method of the java.lang.Math class to generate random
    * numbers.
    * */

//    public static int rollDie(int sides) {
//        Random rand = new Random();
//        return rand.nextInt(sides) + 1;
//    }
//
//    public static String rollDice(int sides) {
//        return String.format("%d and %d", rollDie(sides), rollDie(sides));
//    }
//
//    public static void processDice() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please choose a number of sides for the dice");
//        int sides = getInteger(1, 50);
//        do {
//            System.out.println("Rolling dice...");
//            System.out.println("You rolled " + rollDice(sides));
//            System.out.println("Do you wish to roll again [y/n]?");
//        } while(sc.next().equals("y"));
//    }

    public static void dice() {
        int sides = getInteger2(1, 100);
        int rnd1 = (int) (Math.random() * sides) + 1;
        int rnd2 = (int) (Math.random() * sides) + 1;

        System.out.println(rnd1);
        System.out.println(rnd2);
    }




}
