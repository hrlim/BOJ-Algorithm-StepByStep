package com.acmicpc.algorithm.P18;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 동전 0
 */
public class Q11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stringToInt(st.nextToken());
        int K = stringToInt(st.nextToken());

        int[] digit = new int[N];
        for (int i = N-1; i >= 0; i--) {
            digit[i] = stringToInt(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            count += K / digit[i];
            K %= digit[i];
        }

        System.out.println(count);
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

