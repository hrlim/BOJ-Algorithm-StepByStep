package com.acmicpc.algorithm.P03;

import java.util.Scanner;

/**
 * 구구단
 */
public class Q2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
