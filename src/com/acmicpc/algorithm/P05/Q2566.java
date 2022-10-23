package com.acmicpc.algorithm.P05;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 최댓값 - 브론즈 5
 */
public class Q2566 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int maxNum = Integer.MIN_VALUE;
        int maxNumOfRow = -1;
        int maxNumOfCol = -1;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = stringToInt(st.nextToken());
                if (num > maxNum) {
                    maxNum = num;
                    maxNumOfRow = i + 1;
                    maxNumOfCol = j + 1;

                }
            }
        }

        System.out.println(maxNum);
        System.out.println(maxNumOfRow + " " + maxNumOfCol);

    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
