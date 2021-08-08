package com.bridgelabz;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();

        switch ( num % 2) {
            case 0:
                System.out.println("The number is even");
                break;
            default:
                System.out.println("The number is odd");
        }


    }
}