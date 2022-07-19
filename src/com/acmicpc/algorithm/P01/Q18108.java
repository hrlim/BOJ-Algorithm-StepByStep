package com.acmicpc.algorithm.P01;

import java.util.Scanner;

/**
 * 1998년생인 내가 태국에서는 2541년생?!
 */
public class Q18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int diff = 2541 - 1998;

        System.out.println(A - diff);
    }
}
