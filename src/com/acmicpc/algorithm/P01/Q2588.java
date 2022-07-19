package com.acmicpc.algorithm.P01;

import java.util.Scanner;

/**
 * 곱셈
 */
public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 방법 1
        /*
            int A = sc.nextInt();
            int B = sc.nextInt();

            int B1 = B % 100 % 10;
            int B2 = B % 100 / 10;
            int B3 = B / 100;

            System.out.println(A * B1);
            System.out.println(A * B2);
            System.out.println(A * B3);
            System.out.println(A * B3 * 100 + A * B2 * 10 + A * B1);
        */

        // 방법 2
        int A = sc.nextInt();
        String B = sc. next();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));


    }
}
