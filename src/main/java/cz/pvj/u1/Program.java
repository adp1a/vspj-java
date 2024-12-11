package cz.pvj.u2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            NacteniHodnot.nacti_short();
            NacteniHodnot.nacti_char();
            NacteniHodnot.nacti_double();
            NacteniHodnot.nacti_float();
            NacteniHodnot.nacti_int();
        } catch(NumberFormatException e1) {
            System.err.println("Nastala chyba typu: NumberFormatException");
            e1.printStackTrace();
        } catch (ArithmeticException e2) {
            System.err.println("Nastala chyba typu: ArithmeticException");
            e2.printStackTrace();
        } catch(InputMismatchException e3) {
            System.err.println("Nastala chyba typu: InputMismatchException");
        }
        // bonus ukoly
        Scanner sc = new Scanner(System.in);
        // prace s datovymi typy
        double x1, x2;
        x1 = NacteniHodnot.nacti_double();
        x2 = NacteniHodnot.nacti_double();

        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(x1 + x2);
            case '-':
                System.out.println(x1 - x2);
            case '/':
                System.out.println(x1 / x2);
            case '*':
                System.out.println(x1 * x2);
            default:
                System.out.println("Operace nebyla nalezena");
        }

        // větvici se program
        System.out.print("Zadejte svůj věk: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Jste plnoletý");
        } else {
            System.out.println("Nejste plnoletý");
        }
        // iteracni vypocet
        int sum = 0;
        int count = sc.nextInt();

        for (int i = 1; i <= count;i++) {
            sum += 1;
        }

        System.out.println("Výsledek je: "+sum);
        // osetreni vyjimek
        try {
            sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Špatně zadaná hodnota");
        }
    }
}