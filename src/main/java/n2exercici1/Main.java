package n2exercici1;

public class Main {


     static void main() {

        //try ConsoleReader methods
        insertByte();
        insertInt();
        insertFloat();
        insertDouble();
        insertChar();
        insertString();
        insertYesNo();

    }

    public static void insertByte() {
        byte byteUser;
        byteUser = ConsoleReader.readByte("Introduce a byte value");
        System.out.println("Your byte value is: " + byteUser);
    }

    public static void insertInt() {
        int intUser;
        intUser = ConsoleReader.readInt("Introduce an int value");
        System.out.println("Your int value is: " + intUser);
    }

    public static void insertFloat() {
        float floatUser;
        floatUser = ConsoleReader.readFloat("Introduce a float value");
        System.out.println("Your float value is : " + floatUser);
    }

    public static void insertDouble() {
        double doubleUser;
        doubleUser = ConsoleReader.readDouble("Introduce a double value");
        System.out.println("Your double value is : " + doubleUser);
    }

    public static void insertChar() {
        char charUser;
        charUser = ConsoleReader.readChar("Introduce a char value");
        System.out.println("Your char value is: " + charUser);
    }

    public static void insertString() {
        String stringUser;
        stringUser = ConsoleReader.readString("Enter a string with a minimum of 15 characters.");
        System.out.println("Your string is: " + stringUser);
    }

    public static void insertYesNo() {
        boolean yesOrNoUser;
        yesOrNoUser = ConsoleReader.readYesNo("Type 'n' to set the value to false, or 's' to set it to true.");
        System.out.println("Your boolean value is now " + yesOrNoUser);
    }
}
