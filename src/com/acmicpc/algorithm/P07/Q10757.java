package com.acmicpc.algorithm.P07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 큰 수 A + B
 */
public class Q10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int maxLength = Math.max(A.length(), B.length());
        int[] arrA = new int[maxLength + 1];
        int[] arrB = new int[maxLength + 1];

        for (int i = 0; i < A.length(); i++) {
            arrA[i] = A.charAt(A.length() - 1 - i) - '0';
        }

        for (int i = 0; i < B.length(); i++) {
            arrB[i] = B.charAt(B.length() - 1 - i) - '0';
        }

        for (int i = 0; i < maxLength; i++) {
            int value = arrA[i] + arrB[i];
            arrA[i] = value % 10;
            arrA[i + 1] += (value / 10);
        }


        StringBuilder sb = new StringBuilder();
        for (int i = arrA.length - 1; i >= 0; i--) {
            sb.append(arrA[i]);
        }
        if(arrA[maxLength] != 0){
            System.out.println(sb);
        } else {
            System.out.println(sb.substring(1));
        }
    }
}
