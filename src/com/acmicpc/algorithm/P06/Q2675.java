package com.acmicpc.algorithm.P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 반복
 */
public class Q2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] unit = br.readLine().split(" ");
            int loop = Integer.parseInt(unit[0]);
            String word = unit[1];

            for (int j = 0; j < word.length(); j++) {
                char temp = word.charAt(j);
                for (int k = 0; k < loop; k++) {
                    System.out.printf("%c", temp);
                }
            }
            System.out.println();
        }
    }
}
