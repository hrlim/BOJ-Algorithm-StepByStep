package com.acmicpc.algorithm.P17;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 인간-컴퓨터 상호작용
 */
public class Q16139 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] S = br.readLine().toCharArray();

        int[][] arr = new int[S.length + 1][27];
        StringTokenizer st = null;

        for (int i = 1; i <= S.length; i++) {
            int alpha = S[i - 1] - 'a';

            for (int j = 0; j < 26; j++) {
                arr[i][j] = arr[i - 1][j];
            }
            arr[i][alpha] += 1;
        }

        int q = stringToInt(br.readLine());
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int alpha = st.nextToken().charAt(0) - 'a';
            int start = stringToInt(st.nextToken());
            int end = stringToInt(st.nextToken());

            sb.append(arr[end + 1][alpha] - arr[start][alpha]).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

