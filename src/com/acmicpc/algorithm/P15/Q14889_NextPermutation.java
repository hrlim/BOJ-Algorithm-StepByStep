package com.acmicpc.algorithm.P15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 스타트와 링크
 */
public class Q14889_NextPermutation {

    private static int[][] map;
    private static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = stringToInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = stringToInt(st.nextToken());
            }
        }

        int[] combination = new int[N];
        for (int i = 0; i < N / 2; i++) {
            combination[N - 1 - i] = 1;
        }

        do {
            int powerA = 0, powerB = 0;
            for (int i = 0; i < combination.length; i++) {
                // 값이 1인 경우
                for (int j = 0; j < combination.length; j++) {
                    if(combination[i] == 1 && combination[j] == 1)
                        powerA += map[i][j];
                }

                // 값이 0인 경우
                for (int j = 0; j < combination.length; j++) {
                    if(combination[i] == 0 && combination[j] == 0)
                        powerB += map[i][j];
                }
            }
            minDiff = Math.min(minDiff, Math.abs(powerA - powerB));
        } while(np(combination));
        System.out.println(minDiff);
    }

    private static boolean np(int[] numbers) {
        int N = numbers.length;

        // 1, 꼭지점 찾기
        int i = N - 1;
        while(i > 0 && numbers[i - 1] >= numbers[i]) i--;

        // 2. 역순으로 정렬이 된 경우
        if(i == 0) return false;

        // 3. 바꿀 값 찾기
        int j = N - 1;
        while(numbers[i - 1] >= numbers[j])  j--;

        swap(numbers, i - 1, j);

        // 4. 꼭대기 자리부터 뒷 번호까지 오름차순
        int k = N - 1;
        while(i < k) swap(numbers, i++, k--);

        return true;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
