package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner entry = new Scanner(System.in);


    public static byte readByte(String message) {
        byte input = 0;
        boolean validation = false;

        while (!validation) {
            System.out.println(message);
            try {
                input = entry.nextByte();
                entry.nextLine(); // clean buffer
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.nextLine();
            }
        }
        return input;
    }

    public static int readInt(String message) throws InputMismatchException {
        int input = 0;
        boolean validation = false;

        while (!validation) {
            System.out.println(message);
            try {
                input = entry.nextInt();
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.nextLine(); // clean buffer
            }
        }
        return input;
    }

    public static float readFloat(String message) {
        float input = 0f;
        boolean validation = false;

        while (!validation) {
            System.out.println(message);
            try {
                input = entry.nextFloat();
                entry.nextLine(); //clean buffer
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.nextLine(); // clean buffer
            }
        }
        return input;
    }

    public static double readDouble(String message) {
        double input = 0d;
        boolean validation = false;

        while (!validation) {
            System.out.println(message);
            try {
                input = entry.nextDouble();
                entry.nextLine(); //clean buffer
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.nextLine(); // clean buffer
            }
        }
        return input;
    }

    // Custom exceptions
    public static char readChar(String message) throws CharToLongException {
        String inputString = "";
        char inputChar = ' ';
        boolean validation = false;

        while (!validation) {
            try {
                System.out.println(message);
                inputString = entry.nextLine();
                if (inputString.length() == 1) {
                    inputChar = inputString.charAt(0);
                    validation = true;
                } else {
                    throw new CharToLongException();
                }
            } catch (CharToLongException e) {
                System.out.println(e.getMessage());
            }
        }
        return inputChar;
    }

    public static String readString(String message) throws SentenceToShort {
        // validate that the minimum length is 15 characters
        String input = "";
        boolean validation = false;

        while (!validation) {
            try {
                System.out.println(message);
                input = entry.nextLine();
                if (input.length() >= 15) {
                    validation = true;
                } else {
                    throw new SentenceToShort();
                }
            } catch (SentenceToShort e) {
                System.out.println(e.getMessage());
            }
        }
        return input;
    }

    public static boolean readYesNo(String message) {
        boolean validationYoN = false;
        boolean bucleValidation = false;
        String answer = "";

        while (!bucleValidation) {
            try {
                System.out.println(message);
                answer = entry.nextLine();
                if (answer.equals("y")) {
                    validationYoN = true;
                    bucleValidation = true;
                } else if (answer.equals("n")) {
                    validationYoN = false;
                    bucleValidation = true;
                } else {
                    throw new IncorrectAnswerException();
                }
            } catch (IncorrectAnswerException e) {
                System.out.println(e.getMessage());
            }
        }
        return validationYoN;
    }

}
