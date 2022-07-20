package com.acmicpc.algorithm.P02;

import java.util.Scanner;

/**
 * 오븐 시계
 */
public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (H == 0) {
            H = 24;
        }

        int currentTime = H * 60 + M ;
        int cookingTime = sc.nextInt();

        int endTime = currentTime + cookingTime;

        int changeH = endTime / 60;
        if(changeH >= 24) {
            changeH %= 24;
        }
        int changeM = endTime % 60;

        System.out.printf("%d %d", changeH, changeM);
    }
}
