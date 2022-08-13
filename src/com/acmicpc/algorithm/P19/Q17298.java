package com.acmicpc.algorithm.P19;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수
 */
public class Q17298 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // int[2]  0 : 위치, 1 : 숫자(데이터)
        Stack<int[]> stack = new Stack<>();

        int T = stringToInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] result = new int[T];

        for (int i = 0; i < T; i++) {
            int num = stringToInt(st.nextToken());
            int[] obj = new int[]{i, num};

            while (!stack.empty() && stack.peek()[1] < num) {
                int tmp = stack.pop()[0];
                result[tmp] = num;
            }

            stack.push(obj);
        }

        for (int i = 0; i < result.length; i++) {
            if(result[i] != 0){
                sb.append(result[i]).append(" ");
            } else {
                sb.append("-1").append(" ");
            }
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

