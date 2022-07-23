package com.acmicpc.algorithm.P05;

/**
 * 셀프 넘버
 */
public class Q4673 {
    public static void main(String[] args) {    // 메인

        boolean[] check = new boolean[10001];    // 1부터 10000이므로
        for (int i = 1; i < 100001; i++) {
            int n = d(i);

            if (n < 10001) {    // 10000 이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if(!check[i]){
                System.out.println(i);
            }
        }
    }

    public static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum = sum + (number % 10); // 첫 째 자리수
            number = number / 10;    // 10을 나누어 첫 째 자리를 없앤다
        }

        return sum;
    }
}
