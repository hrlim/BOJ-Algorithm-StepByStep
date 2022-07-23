package com.acmicpc.algorithm.P05;

/**
 * 정수 N개의 합
 */
public class Q15596 {
    public static void main(String[] args) {

    }
    static long sum(int[] a){
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
