package com.bridgelabz;

import java.util.Scanner;

public class vowelConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);

        switch(ch){
            case 'a','e','i','o','u':
                System.out.println(ch +  " is vowel");
                break;
            default:
                System.out.println(ch+ " is constant");

        }

    }

}
