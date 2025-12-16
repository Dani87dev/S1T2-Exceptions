package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner entry = new Scanner(System.in);

    //Métodes

    //OPCIO A 1 de 4
    public static byte readByte(String message) {
        byte input=0;
        boolean validation = false;
        while(!validation) {
            System.out.println("Introduce an byte type number");
            try {
                input = entry.nextByte();
                validation= true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.next();
            }
        }
        return input;
    }

    //OPCIO A 2 de 4
    public static int readInt(String message) throws InputMismatchException{
        int input = 0;
        boolean validation = false;

        while(!validation) {
            System.out.println("Introduce an integer type number");
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
    //OPCIO A 3 de 4
    public static float readFloat(String message){
        float input= 0f;
        boolean validation = false;

        while(!validation) {
            System.out.println("Introduce an integer type number");
            try {
                input = entry.nextFloat();
                validation= true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.next();
            }
        }
        return input;
    }

    //OPCIO A 4 de 4
    public static double readDouble(String message) {
        double input = 0;
        boolean validation = false;

        while(!validation) {
            System.out.println("Introduce an Double type number");
            try {
                input = entry.nextDouble();
                validation= true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                entry.next();
            }
        }
        return input;
    }

    public static char readChar(String message)throws CharToLongException {
        // Només accepta un únic caràcter. Si se n’introdueix més d’un, llença una excepció personalitzada.
        String inputString="";
        char inputChar=' ';
        boolean validation = false;

        while(!validation) {
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

    public static String readString(String message) {
        // Llegeix una cadena tal com es rep, però podries validar longitud mínima o contingut si cal.
        String input="";
        return input;
    }


    public static boolean readYesNo(String message) {
        // Si l’usuari/ària introdueix “s” (minúscula), retorna true. Si introdueix “n”, retorna false.
        // Qualsevol altra entrada hauria de generar una excepció personalitzada.
        boolean input = false;
        return input;
    }

}
