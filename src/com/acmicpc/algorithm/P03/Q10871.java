package com.acmicpc.algorithm.P03;

import java.io.*;
import java.util.StringTokenizer;

/**
 * X 보다 작은 수
 */
public class Q10871 {
    public static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String temp = st.nextToken();
            if (Integer.parseInt(temp) < X) {
                sb.append(temp).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
