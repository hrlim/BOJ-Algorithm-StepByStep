package com.acmicpc.algorithm.P15;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 스도쿠 - 골드 4
 * 백트래킹
 */
public class Q2580 {

    static int[][] map;

    static class Block {
        int row, col, value;

        public Block(int row, int col, int value) {
            this.row = row;
            this.col = col;
            this.value = value;
        }
    }

    static ArrayList<Block> blankBlocks;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        map = new int[10][10];
        blankBlocks = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                map[i][j] = stringToInt(st.nextToken());
                if (map[i][j] == 0) blankBlocks.add(new Block(i, j, 0));
            }
        }
        backtracking(0);
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean backtracking(int current) {
        if (current >= blankBlocks.size()) {
            return true;
        }
        Block block = blankBlocks.get(current);
        int row = block.row;
        int col = block.col;
        int value = block.value;

        for (int i = value + 1; i < 10; i++) {
            if (isAvailable(row, col, i)) {
                block.value = i;
                map[row][col] = i;
                if(backtracking(current + 1)) return true;
                block.value = 0;
                map[row][col] = 0;
            }
        }
        return false;
    }

    static boolean isAvailable(int row, int col, int value) {
        // 열 검사
        for (int i = 1; i <= 9; i++) {
            if (map[i][col] == value) return false;
        }
        // 행 검사
        for (int i = 1; i <= 9; i++) {
            if (map[row][i] == value) return false;
        }

        int dRow = ((row - 1) / 3) * 3;
        int dCol = ((col - 1) / 3) * 3;

        for (int i = dRow + 1; i <= dRow + 3; i++) {
            for (int j = dCol + 1; j <= dCol + 3; j++) {
                if (map[i][j] == value) return false;
            }
        }
        return true;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
