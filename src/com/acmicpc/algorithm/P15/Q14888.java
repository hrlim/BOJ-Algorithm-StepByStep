package com.acmicpc.algorithm.P15;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.util.StringTokenizer;

/**
 * 연산자 끼워넣기
 */
public class Q14888 {

    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static char[] operations = {'+', '-', '*', '/'};

    public static void main(String[] args) throws IOException, ScriptException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = stringToInt(br.readLine());
        int[] numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = stringToInt(st.nextToken());
        }

        int[] operationCnt = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operationCnt[i] = stringToInt(st.nextToken());
        }

        perm(numbers, operationCnt, new int[N - 1], 0);

        bw.write(max + "\n");
        bw.write(min + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static void perm(int[] numbers, int[] operationCnt, int[] output, int depth) throws ScriptException {
        if (depth == numbers.length - 1) {
            int value = calculate(numbers, output);
            max = Math.max(value, max);
            min = Math.min(value, min);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operationCnt[i] == 0) continue;
            operationCnt[i]--;
            output[depth] = i;
            perm(numbers, operationCnt, output, depth + 1);
            operationCnt[i]++;
        }
    }

    static int calculate(int[] numbers, int[] operaters) throws ScriptException {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            char operation = operations[operaters[i - 1]];
            if (operation == '+') {
                result += numbers[i];
            } else if (operation == '-') {
                result -= numbers[i];
            } else if (operation == '*') {
                result *= numbers[i];
            } else if (operation == '/') {
                result /= numbers[i];
            }
        }
        return result;

    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
