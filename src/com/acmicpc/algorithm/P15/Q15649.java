package com.acmicpc.algorithm.P15;

import java.io.*;
import java.util.StringTokenizer;

/**
 * N 과 M ( 1 )
 */
public class Q15649 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());

        comb(N, new int[M], new boolean[N + 1], 0);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static void comb(int N, int[] output, boolean[] isSelected, int depth){
        if(depth == output.length){
            for (int i = 0; i < output.length; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N ; i++) {
            if(isSelected[i]) continue;
            output[depth] = i;
            isSelected[i] = true;
            comb(N, output,isSelected, depth + 1);
            isSelected[i] = false;
        }
    }
    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
