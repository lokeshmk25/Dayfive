package com.bridgelabz;

import javax.swing.*;
import java.util.Scanner;

public class powerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int number = sc.nextInt();
        int powerofTwo = 1;
        if (number > 0 && number < 31) {
            for (int i = 1; i <= number; i++) {
                powerofTwo = powerofTwo * 2;
                System.out.println(2 + " to the power of " + i + ":"  +powerofTwo);
            }
        }
        else{
                System.out.println("overflows the limit");
            }
        }
    }

