package com.bridgelabz;

import java.util.Scanner;

public class computeQR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Quotient:" +quotient);
        System.out.println("Remainder:" +remainder);

    }
}
