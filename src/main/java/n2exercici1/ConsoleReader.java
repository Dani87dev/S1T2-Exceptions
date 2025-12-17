package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner entry = new Scanner(System.in);

    //Métodes

    //Amb tractament d'InputMismatchException:
    public static byte readByte(String message) {
        byte input=0;
        boolean validation = false;
        while(!validation) {
            System.out.println("please, introduce an byte type number");
            try {
                input = entry.nextByte();
                entry.nextLine();
                validation= true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.next();
            }
        }
        return input;
    }

    //Amb tractament d'InputMismatchException:
    public static int readInt(String message) throws InputMismatchException{
        int input = 0;
        boolean validation = false;

        while(!validation) {
            System.out.println("Introduce an integer type number");
            entry.nextLine();
            try {
                input = entry.nextInt();

                validation= true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.next();
            }
        }
        return input;
    }
    //Amb tractament d'InputMismatchException:
    public static float readFloat(String message){
        float input= 0f;
        boolean validation = false;

        while(!validation) {
            System.out.println("Introduce an integer type number");
            try {
                input = entry.nextFloat();
                entry.nextLine(); //clean buffer
                validation= true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.next();
            }
        }
        return input;
    }

    //Amb tractament d'InputMismatchException:
    public static double readDouble(String message) {
        double input = 0;
        boolean validation = false;

        while(!validation) {
            System.out.println("Introduce an Double type number");
            try {
                input = entry.nextDouble();
                entry.nextLine(); //clean buffer
                validation= true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.next();
            }
        }
        return input;
    }
    //Amb una excepció personalitzada:
    public static char readChar(String message)throws CharToLongException {
        // Només accepta un únic caràcter. Si se n’introdueix més d’un, llença una excepció personalitzada.
        String inputString="";
        char inputChar=' ';
        boolean validation = false;

        while(!validation) {

            //meter try catch

            System.out.println("Introduce a Char type character");
            inputString = entry.nextLine();
            if (inputString.length()==1) {
                inputChar = inputString.charAt(0);
            } else {
                throw new CharToLongException();
            }
        }
        return inputChar;
    }

    //Amb una excepció personalitzada:
    public static String readString(String message) throws SentenceToShort{
        // Llegeix una cadena tal com es rep, però podries validar longitud mínima o contingut si cal.
        String input="";
        boolean validation = false;

        while(!validation) {

            //meter try catch

            System.out.println("Introduce a sentence with minimun 15 characters");
            input = entry.nextLine();
            if (input.length()>=15) {
                validation = true;
            } else {
                throw new SentenceToShort();
            }
        }
        return input;
    }

    //Amb una excepció personalitzada:
    public static boolean readYesNo(String message) {
        // Si l’usuari/ària introdueix “s” (minúscula), retorna true. Si introdueix “n”, retorna false.
        // Qualsevol altra entrada hauria de generar una excepció personalitzada.
        boolean validationYoN = false;
        boolean bucleValidation= false;
        String answer = "";

        while(!bucleValidation) {
            System.out.println("Introduce 'y'(YES) or 'n'(NO):");
            answer = entry.nextLine();

            //meter try catch

            if(answer.equals("s") ){
                validationYoN = true;
            } else if (answer.equals("n")) {
                validationYoN = false;
            } else {
                throw new IncorrectAnswerException();
            }
        }
        return validationYoN;
    }

}
