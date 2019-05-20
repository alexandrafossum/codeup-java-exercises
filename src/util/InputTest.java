package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        input.getString();
        input.getInt();
        input.getInt(1, 50);
        input.getDouble();
        input.getDouble(1.0, 50.0);

    }
}
