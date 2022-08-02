package com.acmicpc.algorithm.P09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 10
 */
public class Q2447 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		char[][] arr = new char[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = ' ';
			}
		}
		star10(arr, 0, 0, N);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append(System.lineSeparator());// 
		}
		System.out.println(sb);
	}

	static void star10(char[][] arr, int x, int y, int N) {
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(i == 1 && j == 1)) {
					star10(arr, x + i * (N / 3), y + j * (N / 3), N / 3);
				}
			}
		}
	}

}
