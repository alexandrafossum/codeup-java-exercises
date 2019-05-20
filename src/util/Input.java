package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.println(msg);
        return sc.nextLine().trim().toLowerCase();
    }

    public String getString() {
        return getString("Type something: ");
    }

    public boolean yesNo() {
        String userAns = getString("Continue? [Y/N]");
        return userAns.trim().equalsIgnoreCase("yes") || userAns.trim().equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int intInput = getInt();
        if (intInput < min || intInput > max) {
            System.out.println("Error! Outside of boundaries!");
            return getInt(min, max);
        }

        return intInput;
    }

    int getInt() {
        return Integer.parseInt(getString("Give me a number: "));
    }

    public double getDouble(double min, double max) {
        double doubleInput = getDouble();
        if (doubleInput < min || doubleInput > max) {
            System.out.println("Error! Outside of boundaries!");
            return getDouble();
        }

        return doubleInput;
    }

    public double getDouble() {
        return Double.parseDouble(getString("Give me a decimal number: "));
    }

}



