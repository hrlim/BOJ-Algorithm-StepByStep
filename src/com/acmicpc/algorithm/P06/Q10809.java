package com.acmicpc.algorithm.P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 알파벳 찾기
 */
public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < word.length(); i++) {
            int temp = word.charAt(i) - 'a';
            if (arr[temp] == -1) {
                arr[temp] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
