package com.acmicpc.algorithm.P03;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A + B - 7
 */
public class Q11021 {
    public static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(A + B).append(NEW_LINE);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
