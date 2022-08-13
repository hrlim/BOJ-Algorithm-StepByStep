package com.acmicpc.algorithm.P19;

import java.io.*;
import java.util.Stack;

/**
 * 괄호
 */
public class Q9012 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = stringToInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        stack.push(ch);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()) {
                sb.append("YES").append(System.lineSeparator());
            } else {
                sb.append("NO").append(System.lineSeparator());
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

