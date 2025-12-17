package n2exercici1;

import java.io.Console;
import java.net.StandardSocketOptions;



public class Main {

    public static void main (String [] args ) {
        byte byteUser;
        int intUser;
        float floatUser;
        double doubleUser;
        char charUser;
        String stringUser;
        boolean yesOrNoUser;

        byteUser = ConsoleReader.readByte("Introduce a byte value");
        System.out.println("Your byte value is: " + byteUser);

        intUser = ConsoleReader.readInt("Introduce an int value");
        System.out.println("Your int value is: " + intUser);

        floatUser = ConsoleReader.readFloat("Introduce a float value");
        System.out.println("Your float value is : " + floatUser);

        doubleUser = ConsoleReader.readDouble("Introduce a double value");
        System.out.println("Your double value is : " + doubleUser);

        charUser = ConsoleReader.readChar("Introduce a char value");
        System.out.println("Your char value is: " + charUser);

        stringUser = ConsoleReader.readString("Enter a string with a minimum of 15 characters.");
        System.out.println("Your string is: " + stringUser);

        yesOrNoUser = ConsoleReader.readYesNo("Type 'n' to set the value to false, or 'y' to set it to true.");
        System.out.println("Your boolean value is now " + yesOrNoUser);









    }
}
