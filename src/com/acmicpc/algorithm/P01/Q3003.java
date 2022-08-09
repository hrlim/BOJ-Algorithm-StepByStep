package com.acmicpc.algorithm.P01;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class Q3003 {
    // 킹, 퀸, 룩, 비숏, 나이트, 폰
    public static final int[] collect = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sb.append(collect[i] - stringToInt(st.nextToken()) + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int stringToInt(String s){
        return Integer.parseInt(s);
    }
}
