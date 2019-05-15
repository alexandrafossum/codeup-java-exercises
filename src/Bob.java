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

    }
    public static String sayHello(String name) {
        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        return String.format("Hello, %s!", name);
    }
}
