package com.acmicpc.algorithm.P07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 손익분기점
 */
public class Q1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

//        C * X >  A + ( B * X)
//        상품가격 * X > 불변비용 + ( 가변비용 * X)
//        (상품가격 - 가변비용) * X >= 불변비용
//        X >= 불변비용 / (상품가격 - 가변비용)
//        X >= A / (C - B)

        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1);
        }
    }
}
