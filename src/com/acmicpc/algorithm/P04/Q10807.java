package com.acmicpc.algorithm.P04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 개수 세기 - 브론즈 5
 */
public class Q10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[201];
        int N = stringToInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = stringToInt(st.nextToken()) + 100;
            count[num]++;
        }
        int V = stringToInt(br.readLine()) + 100;
        System.out.println(count[V]);

    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
