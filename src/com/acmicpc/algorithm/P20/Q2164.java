package com.acmicpc.algorithm.P20;

import java.io.*;
import java.util.*;

/**
 * 카드 2
 */
public class Q2164 {
        public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = stringToInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= T; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            int temp = queue.poll();
            queue.offer(temp);
        }
        System.out.println(queue.poll());
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

