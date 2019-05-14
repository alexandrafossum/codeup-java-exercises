import java.util.Scanner;
import java.util.Random;

public class ConsoleAdventureGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = rand.nextInt(69);

        int heroStats = 100;
        int enemyStats = 100;
        int heroHealth = 50;
        int enemyHealth = 50;

        System.out.print("What ho, hero! Tell us your name.");

        String heroName = sc.nextLine();

        System.out.println("Are you ready to begin your quest, " + heroName.toUpperCase() + "? [YES/NO]\n");

        String heroReply = sc.next();

        System.out.println("*******************");
        System.out.println("* HERO NAME: " + heroName.toUpperCase());
        System.out.println("* HERO STATS: " + heroStats);
        System.out.println("* HERO HEALTH: " + heroHealth);

        System.out.println("*******************");

        System.out.println("* ENEMY NAME: THE PATRIARCHY");
        System.out.println("* ENEMY STATS: " + enemyStats);
        System.out.println("* ENEMY HEALTH: " + enemyHealth);

        System.out.println("*******************");

      boolean startQuest;

        do {
            startQuest = (enemyHealth <= 0 && heroHealth <= 0);

            System.out.println("What would you like to do, " + heroName.toUpperCase() + "?");
            System.out.println("Attack! [a] \nTake a potion! [h] \nRUN AWAY!!! [r]");
            String heroAction = sc.next();

            if (heroAction.equals("a")) {
                enemyHealth -= n;
                System.out.println("You have attacked and reduced your enemy's health to " + enemyHealth + "\n");
            } else if (enemyHealth < 0) {
                System.out.println("You have defeated your enemy!");
                System.exit(0);
            } else if (heroAction.equals("h")) {
                heroHealth += n;
                System.out.println("Your health is now at: " + heroHealth + "\n");
            } else if (heroHealth < 0) {
                System.out.println("You are deaded.");
                System.exit(0);
            } else {
                System.out.println("Okay, I see how it is, " + heroName.toUpperCase() + ", you yellow-bellied coward!!!");
                System.exit(0);
            }

        } while (heroHealth > 0 && enemyHealth > 0);

    }
}

