package com.bridgelabz;

import java.util.Scanner;

public class largestofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(x>y && x>z) {
            System.out.println("X is greater");
        }
          else if(y>z) {
            System.out.println("y is greater");
        }
          else
              System.out.println("z is greater");


        }
    }

