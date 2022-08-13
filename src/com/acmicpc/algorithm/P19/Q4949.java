package com.acmicpc.algorithm.P19;

import java.io.*;
import java.util.Stack;

/**
 * 균형잡힌 세상
 */
public class Q4949 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        while (true) {
            stack.clear();

            String input = br.readLine();
            if (input.equals(".")) break;

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty() || (stack.peek() == '(' && ch == ']') || (stack.peek() == '[' && ch == ')')) {
                        stack.push(ch);
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                sb.append("yes").append(System.lineSeparator());
            } else {
                sb.append("no").append(System.lineSeparator());
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

