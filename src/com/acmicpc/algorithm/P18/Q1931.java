package com.acmicpc.algorithm.P18;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * 회의실 배정
 */
public class Q1931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = stringToInt(br.readLine());
        int[][] seminar = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            seminar[i][0] = stringToInt(st.nextToken());
            seminar[i][1] = stringToInt(st.nextToken());
        }

        Arrays.sort(seminar, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int count = 0;
        int previousEndTime = 0;
        for (int i = 0; i < N; i++) {
            if(previousEndTime <= seminar[i][0]){
                count++;
                previousEndTime = seminar[i][1];
            }
        }
        System.out.println(count);
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
