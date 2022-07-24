package com.acmicpc.algorithm.P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 크로아티아 알파벳
 */
public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croatia.length; i++) {
            if(word.contains(croatia[i])){
                word = word.replaceAll(croatia[i], "!");
            }
        }
        System.out.println(word.length());
    }
}
