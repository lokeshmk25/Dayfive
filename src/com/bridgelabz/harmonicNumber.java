package com.bridgelabz;

import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();

        double sum=0.0;
        for(int i=1; i<=number;i++){
            sum = sum + 1.0/i;
        }
        System.out.println("Nth harmonic number is :" +sum);
    }
}
