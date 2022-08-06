package com.acmicpc.algorithm.P19;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 스택
 */
public class Q10828 {
    private static int[] stack = new int[10_000];
    private static int top = -1;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = stringToInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int digit;

            if (command.equals("push")) {
                digit = stringToInt(st.nextToken());
                push(digit);
            } else if (command.equals("top")) {
                sb.append(top()).append(System.lineSeparator());
            } else if (command.equals("size")) {
                sb.append(size()).append(System.lineSeparator());
            } else if (command.equals("empty")) {
                sb.append(empty()).append(System.lineSeparator());
            } else if (command.equals("pop")) {
                sb.append(pop()).append(System.lineSeparator());
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static void push(int X) {
        top++;
        stack[top] = X;
    }

    static int pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return -1;
    }

    static int size() {
        return top + 1;
    }

    static int empty() {
        if (top >= 0) {
            return 0;
        }
        return 1;
    }

    static int top() {
        if (top >= 0) {
            return stack[top];
        }
        return -1;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

