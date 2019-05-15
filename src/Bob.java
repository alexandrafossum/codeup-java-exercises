import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String userToBob = sc.nextLine();

        Boolean exclaim = userToBob.contains("!");
        Boolean query = userToBob.contains("?");
        Boolean nothing = userToBob.contains("");


        if (exclaim) {
            System.out.println("Woah, chill out!");
        } else if (query) {
            System.out.println("Sure.");
        } else if (nothing) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

        //Walk-through version

        System.out.println("Talk to Bob?");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Say something to Bob.");
            String userInput = sc.next();

            do {
                userInput = sc.next();

                if (userInput.endsWith("?")) {
                    System.out.println("Sure");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Chill out!");
                } else if (userInput.equals("")) {
                    System.out.println("Fine be like that");
                } else {
                    System.out.println("Whatever");
                }

            } while (!userInput.equals("You're grounded!"));
        }
    }
}
