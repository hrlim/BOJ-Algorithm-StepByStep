package com.acmicpc.algorithm.P04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 과제 안 내신 분 ...? - 브론즈 5
 */
public class Q5597 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isVisited = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int num = stringToInt(br.readLine());
            isVisited[num] = true;
        }

        for (int i = 1; i < isVisited.length; i++) {
            if(!isVisited[i]) sb.append(i).append("\n");
        }

        System.out.println(sb.toString());

    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
