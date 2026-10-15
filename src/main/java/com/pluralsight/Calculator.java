package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Enter the first number: 5
        System.out.println("Enter the first number: ");
        int num1 = myScanner.nextInt();

        //Enter the second number: 12
        System.out.println("Enter the second number: ");
        int num2 = myScanner.nextInt();

        //Possible calculations:
        System.out.println("Possible calculations: ");

        //Please select an option: M
        System.out.println("(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide");

        String operationChoice = myScanner.next();

        //5 * 12 = 60
        System.out.println("The Answer is: " + num1 * num2);












    }
}
