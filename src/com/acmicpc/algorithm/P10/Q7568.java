package com.acmicpc.algorithm.P10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 덩치
 */
public class Q7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] weightKey = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weightKey[i][0] = Integer.parseInt(st.nextToken());
            weightKey[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if(i == j){
                    continue;
                }
                if(weightKey[i][0] < weightKey[j][0] && weightKey[i][1] < weightKey[j][1]){
                    rank++;
                }
            }
            System.out.print(rank + " ");

        }
        /**
            Arrays.sort(weightKey, (o1, o2) -> {
                boolean isHeavier = false;
                if(o1[0] > o2[0]){
                    isHeavier = true;
                }
                boolean isTaller = false;
                if(o1[1] > o2[1]){
                    isTaller = true;
                }
                if (isHeavier && isTaller) {
                    return o1[0] - o2[0];
                } else if( !isHeavier && !isTaller){
                    return o1[0] - o2[0];
                }
                return 0;
            });
        */
    }
}
