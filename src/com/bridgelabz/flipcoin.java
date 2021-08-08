package com.bridgelabz;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class flipcoin {
    public static void main(String[] args) {
        int headCount = 0;
        int tailCount = 0;
        int heads, tails;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of times the coin need to be tossed");
        int toss = scanner.nextInt();
        for (int i = 0; i < toss; i++) {
            if (Math.random() > 0.5) {
                headCount++;
            } else {
                tailCount++;
            }
        }
        heads = headCount * 100 / toss;
        tails = tailCount * 100 / toss;

        System.out.println("percentage of heads:" + heads);
        System.out.println("percentage of tails:" + tails);
    }
}