package com.acmicpc.algorithm.P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 상수
 */
public class Q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        String B = st.nextToken();

        int reverseA = Integer.valueOf(new StringBuilder(A).reverse().toString());
        int reverseB = Integer.valueOf(new StringBuilder(B).reverse().toString());

        if (reverseA > reverseB) {
            System.out.println(reverseA);
        } else {
            System.out.println(reverseB);
        }
    }
}
