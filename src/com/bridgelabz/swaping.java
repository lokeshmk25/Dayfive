package com.bridgelabz;

import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int t;

        t=x;
        x=y;
        y=t;

        System.out.println("The numbers after swapping x:"+x + "\t" +"Y:"+y );


    }
}
