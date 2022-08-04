package com.acmicpc.algorithm.P19;

import java.io.*;
import java.util.Stack;

/**
 * 제로
 */
public class Q10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = stringToInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            int n = stringToInt(br.readLine());
            if (n == 0 && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        int sum = 0;
        for (int i : stack) {
            sum += i;
        }

        System.out.println(sum);

    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

