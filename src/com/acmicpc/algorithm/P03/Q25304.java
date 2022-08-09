package com.acmicpc.algorithm.P03;

import java.io.*;

/**
 * 영수증
 */
public class Q25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine()); // 첫번째 N 문자 입력받기

        int sum = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] numbers = line.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            sum += a * b;
        }
        if(sum == X){
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
