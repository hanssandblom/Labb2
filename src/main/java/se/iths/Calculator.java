package se.iths;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {

        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        String str = "";

        System.out.println("2 + 2 is " + new Calculator().add(2, 2) + ".");

        System.out.println("2 - 2 is " + new Calculator().subtract(2, 2) + ".");

        System.out.println("2 * 2 is " + new Calculator().multiply(2, 2) + ".");

        System.out.println("2 / 2 is " + new Calculator().divide(2, 2) + ".");

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a string");

        String stringConvert = scan.nextLine();

        TextProcessor myTextModify = new TextProcessor ();

        str = myTextModify.notEmpty(stringConvert);
        System.out.println(str + " Check that string is not null");

        str = myTextModify.textToUpper(stringConvert);
        System.out.println(str + " Converted to upper");

        str = myTextModify.textToLower(stringConvert);
        System.out.println(str + " Converted to lower");

        str = myTextModify.textBackwards(stringConvert);
        System.out.println(str + " String returned backwards");

    }
}