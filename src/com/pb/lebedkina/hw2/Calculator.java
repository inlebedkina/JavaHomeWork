package com.pb.lebedkina.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        String sign;

        x = scan.nextInt();
        y = scan.nextInt();
        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.println("x+y");
                break;
            case "-":
                System.out.println("x-y");
                break;
            case "*":
                System.out.println("x*y");
                break;
            case "/":
                System.out.println("x/y");
                break;
        }
                System.out.println(" x = " + x + " y = " + y + " sign = " + sign);
    }
}
