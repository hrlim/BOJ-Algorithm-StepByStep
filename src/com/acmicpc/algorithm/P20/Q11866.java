package com.acmicpc.algorithm.P20;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제 0
 */
public class Q11866 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int K = stringToInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        sb.append("<");

        while (!queue.isEmpty()){
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.setLength(sb.length() - 2);
        sb.append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

