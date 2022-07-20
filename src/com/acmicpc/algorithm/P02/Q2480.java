package com.acmicpc.algorithm.P02;

import java.util.Scanner;

/**
 * 주사위 세개
 */
public class Q2480 {
    public static void main(String[] args) {

        int[] visited = new int[7];

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        visited[X] +=  1;
        visited[Y] +=  1;
        visited[Z] +=  1;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < visited.length; i++) {
            if(visited[i] == 3){
                System.out.println(10000 + i * 1000);
                return;
            } else if(visited[i] == 2){
                System.out.println(1000 + i * 100);
                return;
            } else if(visited[i] == 1){
                max = i;
            }
        }
        System.out.println(max * 100);
    }
}
