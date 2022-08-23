package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 토마토 - 골드 5
 * 너비우선탐색, 그래프
 */
public class Q7569 {

    public static int[][][] box;
    public static int M, N, H;

    // 높이, 가로(ROW), 세로(COL)
    // 높이 2개, 상하좌우
    public static int[][] dirs = {{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = stringToInt(st.nextToken());
        N = stringToInt(st.nextToken());
        H = stringToInt(st.nextToken());

        box = new int[H][N][M];
        int count = 0; // 덜 익은 토마토 갯수
        ArrayList<int[]> tomato = new ArrayList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = stringToInt(st.nextToken());
                    if (box[i][j][k] == 0) count++;
                    else if (box[i][j][k] == 1) tomato.add(new int[]{i, j, k});
                }
            }
        }
        if(count == 0)
            System.out.println(0);
        else
            System.out.println(bfs(count, tomato));
    }

    static int bfs(int count, ArrayList<int[]> tomato) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < tomato.size(); i++) {
            int[] one = tomato.get(i);
            queue.offer(one);
        }
        int ripeTomatoCount = 0;
        int answer = -1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curH = cur[0];
            int curR = cur[1];
            int curC = cur[2];

            answer = box[curH][curR][curC];
            for (int i = 0; i < dirs.length; i++) {
                int dHeight = curH + dirs[i][0];
                int dRow = curR + dirs[i][1];
                int dCol = curC + dirs[i][2];

                if (!isRange(dHeight, dRow, dCol)) continue;
                if (box[dHeight][dRow][dCol] != 0) continue;

                queue.offer(new int[]{dHeight, dRow, dCol});
                box[dHeight][dRow][dCol] = box[curH][curR][curC] + 1;
                ripeTomatoCount++;
            }
        }
        if(ripeTomatoCount != count)
            answer = 0;

        return answer - 1;
    }

    static boolean isRange(int height, int row, int col) {
        return height >= 0 && height < H && row >= 0 && row < N && col >= 0 && col < M;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
