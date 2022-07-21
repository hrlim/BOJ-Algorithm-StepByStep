package com.acmicpc.algorithm.P03;

import java.io.*;

/**
 * 빠른 A + B
 */
public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언

        int N = Integer.parseInt(br.readLine()); // 첫번째 N 문자 입력받기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] numbers = line.split(" ");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);
            sb.append((A + B)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
