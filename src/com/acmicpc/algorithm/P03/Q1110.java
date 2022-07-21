package com.acmicpc.algorithm.P03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 더하기 사이클
 */
public class Q1110 {
    public static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int first;
        int second;

        int roof = 0;
        int temp = N;

        while(true){
            if(temp < 10){
                first = 0;
                second = temp;
            } else {
                first = temp / 10;
                second = temp % 10;
            }

            int result = first + second;
            roof++;

            if(second * 10 + result % 10 == N){
                break;
            } else {
                temp = second * 10 + result % 10;
            }
        }
        System.out.println(roof);
    }
}
