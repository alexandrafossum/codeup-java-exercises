import java.util.Scanner;

public class ServerNameGenerator {

        static String[] adjectives = {"unwieldy", "spooky", "anxious", "omniscient", "secretive", "zealous", "bilious", "verdant", "salubrious", "sagacious", "sad"};
        static String[] nouns = {"suspenders", "trouble", "airplane", "Luxembourgian", "taxes", "Keanu Reeves", "gunslinger", "affidavit", "knuckle", "plowman", "piano"};

    public static String randomName(String[] serverName) {
           int i = (int)(Math.random() * serverName.length);
           return serverName[i];
       }

    public static void main(String[] args) {
        String yesGenerate;

        do {
        Scanner sc = new Scanner(System.in);

        String generateAdj = randomName(adjectives);
        String generateNoun = randomName(nouns);
        String sName = generateAdj + "-" + generateNoun;
        System.err.printf("Here is your server name:\n" + sName + "\n");
        System.out.println("----------------------");
        System.out.println("Generate another name?");
        yesGenerate = sc.next();

        } while (yesGenerate.equalsIgnoreCase("yes") || yesGenerate.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
    }
}
