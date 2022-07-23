package com.acmicpc.algorithm.P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 단어 공부
 */
public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'A']++;
        }

        int maxWordCnt = Integer.MIN_VALUE;
        int maxWordPos = -1;

        for (int i = 0; i < 26; i++) {
            if (maxWordCnt <= arr[i]) {
                if (maxWordCnt == arr[i]) {
                    maxWordPos = -1;
                } else {
                    maxWordCnt = arr[i];
                    maxWordPos = i;
                }
            }
        }

        if (maxWordPos != -1) {
            System.out.println((char) (maxWordPos + 'A'));
        } else {
            System.out.println("?");
        }
    }
}
