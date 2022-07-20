package com.acmicpc.algorithm.P02;

import java.util.Scanner;

/**
 * 알람 시계
 */
public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (H == 0) {
            H = 24;
        }

        int time = H * 60 + M ;
        int alarm = time - 45;

        int changeH = alarm / 60;
        if(changeH > 24) {
            changeH -= 24;
        }
        int changeM = alarm % 60;

        System.out.printf("%d %d", changeH, changeM);
    }
}
