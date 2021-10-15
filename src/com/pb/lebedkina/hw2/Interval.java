package com.pb.lebedkina.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;

        x= scan.nextInt();

        if (x <= 14) {
            System.out.print("[0-14]");
        } else if (x >= 15 && x <= 35) {
            System.out.print("[15-35]");
        } else if (x >= 36 && x <= 50) {
            System.out.print("[36-50]");
        } else if (x >= 50 && x <= 100) {
            System.out.print("x= 51-100");
        }
    }
}
