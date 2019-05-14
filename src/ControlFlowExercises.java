import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;

        while (i <= 15) {
            System.out.println(i++);
        }

        System.out.println("************");

        int y = 2;

        do {
            System.out.println(y += 2);
        } while (y < 100);
    }
}
