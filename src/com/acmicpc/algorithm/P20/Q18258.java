package com.acmicpc.algorithm.P20;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 큐 2
 */
public class Q18258 {
    public static int[] queue = new int[2_000_000];
    public static int rear = 0;
    public static int front = 0;
    public static int size = 0;
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
            } else if (command.equals("front")) {
                sb.append(front()).append(System.lineSeparator());
            } else if (command.equals("back")) {
                sb.append(back()).append(System.lineSeparator());
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
        queue[rear] = X;
        size++;
        rear++;
    }

    static int pop() {
        if (size > 0) {
            size--;
            return queue[front++];
        }
        return -1;
    }

    static int size() {
        return size;
    }

    static int empty() {
        return size == 0 ? 1 : 0;
    }

    static int front() {
        if (size > 0) {
            return queue[front];
        }
        return -1;
    }

    static int back() {
        if (size > 0) {
            return queue[rear - 1];
        }
        return -1;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

