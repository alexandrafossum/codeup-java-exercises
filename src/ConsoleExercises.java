import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;

//        System.out.format("The value of pi is approximately %.f" + pi + ".");

//        System.out.print("Please enter a number:\n");
//        int numberInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + numberInput + "\" <--");

//        System.out.println("Please enter three words:\n");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//        System.out.println("You entered: " + wordOne + " " + wordTwo + " " + wordThree);

//        System.out.println("Please enter a sentence:\n");
//        String userSentence = scanner.nextLine();
//        System.out.println("You entered: " + userSentence);

        System.out.println("Enter the length of your classroom");
        int classroomLength = scanner.nextInt();
        System.out.println("Enter the width of your classroom");
        int classroomWidth = scanner.nextInt();
        int classPerimeter = ((classroomLength*= 2) + (classroomWidth *= 2));
        int classArea =  classroomLength * classroomWidth;
        System.out.println("The perimeter is: " + classPerimeter);
        System.out.println("The area is: " + classArea);

    }

}
