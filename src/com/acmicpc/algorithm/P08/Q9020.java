package com.acmicpc.algorithm.P08;

import java.io.*;

/**
 * 골드바흐의 추측
 */
public class Q9020 {

    // 소수가 아닌 경우에는 true, 소수인 경우에는 false
    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = stringToInt(br.readLine());

        getPrimes();

        for (int test_case = 1; test_case <= T ; test_case++) {
            int N = stringToInt(br.readLine());

            // 두 수의 차가 가장 작은 경우를 출력하기 때문에 절반인 수부터
            // firstPrime 은 1 씩 감소, secondPrime 은 1씩 증가하여 확인
            int firstPrime = N / 2;
            int secondPrime = N / 2;

            while(true) {
                if (!prime[firstPrime] && !prime[secondPrime]) {
                    sb.append(firstPrime).append(" ").append(secondPrime).append(System.lineSeparator());
                    break;
                }
                firstPrime--;
                secondPrime++;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void getPrimes(){
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length ; j += i) {
                prime[j] = true;
            }
        }
    }
    static int stringToInt(String s){
        return Integer.parseInt(s);
    }

}
