package com.acmicpc.algorithm.P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 그룹 단어 체커
 */
public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] isVisited = new boolean[26];
        int groupWordCnt = 0;
        for (int i = 0; i < T; i++) {
            String word = br.readLine();

            boolean isGroupWord = true;
            int before = word.charAt(0) - 'a';

            for (int j = 0; j < word.length(); j++) {
                int wordPos = word.charAt(j) - 'a';
                if (!isVisited[wordPos]) {
                    if(before != wordPos){
                        isVisited[before] = true;
                        before = wordPos;
                    }
                } else {
                    isGroupWord = false;
                    break;
                }
            }
            if (isGroupWord | word.length() == 1) {
                groupWordCnt++;
            }
            Arrays.fill(isVisited, false);
        }
        System.out.println(groupWordCnt);
    }
}
