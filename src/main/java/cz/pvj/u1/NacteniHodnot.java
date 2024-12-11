package cz.pvj.u2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NacteniHodnot {
    private static Scanner sc = new Scanner(System.in);

    public static short nacti_short() throws NumberFormatException, ArithmeticException, InputMismatchException {
        System.out.print("Zadejte hodnotu typu short: ");
        short val = sc.nextShort();
        return val;
    }

    public static int nacti_int() throws NumberFormatException, ArithmeticException, InputMismatchException {
        System.out.print("Zadejte hodnotu typu integer: ");
        int val = sc.nextInt();
        return val;
    }

    public static float nacti_float() throws NumberFormatException, ArithmeticException, InputMismatchException {
        System.out.print("Zadejte hodnotu typu float: ");
        float val = sc.nextFloat();
        return val;
    }

    public static double nacti_double() throws NumberFormatException, ArithmeticException, InputMismatchException {
        System.out.print("Zadejte hodnotu typu double: ");
        double val = sc.nextDouble();
        return val;
    }

    public static String nacti_string() throws NumberFormatException, ArithmeticException, InputMismatchException {
        System.out.print("Zadejte hodnotu typu string: ");
        String val = sc.next();
        return val;
    }

    public static char nacti_char() throws NumberFormatException, ArithmeticException, InputMismatchException {
        System.out.print("Zadejte hodnotu typu char: ");
        char val = sc.next().charAt(0);
        return val;
    }

}
