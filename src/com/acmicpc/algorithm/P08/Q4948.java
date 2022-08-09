package com.acmicpc.algorithm.P08;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 베르트랑 공준
 */
public class Q4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int temp = stringToInt(br.readLine());
            if(temp == 0){
                break;
            }
            sb.append(getPrimeCounts(temp , temp * 2) + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    /**
     * x 보다 크고 y 보다 작거나 같은 수 중에 소수인 갯수 구하기
     *
     * @param x
     * @param y
     * @return
     */
    static int getPrimeCounts(int x, int y) {
        int primeCnt = 0;
        for (int i = x + 1; i <= y ; i++) {
            if(isPrime(i)){
                primeCnt++;
            }
        }
        return primeCnt;
    }

    static boolean isPrime(int n){
        if(n == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }

        return true;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
