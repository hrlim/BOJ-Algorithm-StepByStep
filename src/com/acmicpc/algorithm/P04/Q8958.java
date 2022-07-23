package com.acmicpc.algorithm.P04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * OX 퀴즈
 */
public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int result = 0;
            int plusPoint = 0;
            String temp = br.readLine();
            for (int j = 0; j < temp.length(); j++) {
                if(temp.charAt(j) == 'O'){
                    result += ++plusPoint;
                }else {
                    plusPoint = 0;
                }
            }

            System.out.println(result);
        }
    }
}
