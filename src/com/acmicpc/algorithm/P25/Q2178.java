package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.*;

/**
 * 미로 탐색
 */
public class Q2178 {

    static char[][] map;
    static int N, M;
    static int minPath = Integer.MAX_VALUE;

    // 상하좌우
    static int[][] dirs4 = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = stringToInt(st.nextToken());
        M = stringToInt(st.nextToken());

        // 방문 했는지 확인하는 변수,
        // 벽이면 확인할 필요가 없으므로 방문 했다고 표시
        // true : 방문됨, false : 방문가능
        boolean[][] isVisited = new boolean[N][M];
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] == '0'){
                    isVisited[i][j] = true;
                }
            }
        }

        // 시간 초과 dfs(0,0, 0, isVisited);
        bfs(0,0, isVisited);
        sb.append(minPath).append("");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int row, int col, int count, boolean[][] isVisited) {
        if(row == N - 1 && col == M -1){
            // 시작출발점도 포함하기 위해서 count + 1
            minPath = Math.min(minPath, count + 1);
        }

        for (int i = 0; i < dirs4.length; i++) {
            int dRow = row + dirs4[i][0];
            int dCol = col + dirs4[i][1];

            if(isRange(dRow, dCol) && !isVisited[dRow][dCol]){
                isVisited[row][col] = true;
                dfs(dRow, dCol, count + 1, isVisited);
                isVisited[row][col] = false;
            }
        }
    }

    static int bfs(int row, int col, boolean[][] isVisited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(row);
        queue.offer(col);

        isVisited[row][col] = true;

        int[][] order = new int[N][M];
        order[row][col] = 1;

        while (!queue.isEmpty()) {
            int curRow = queue.poll();
            int curCol = queue.poll();

            for (int i = 0; i < dirs4.length; i++) {
                int dRow = curRow + dirs4[i][0];
                int dCol = curCol + dirs4[i][1];

                if(isRange(dRow, dCol) && !isVisited[dRow][dCol]){
                    isVisited[dRow][dCol] = true;
                    order[dRow][dCol] = order[curRow][curCol] + 1;
                    queue.offer(dRow);
                    queue.offer(dCol);
                }
            }
        }
        minPath = order[N-1][M-1];
        return minPath;
    }

    static boolean isRange(int row, int col) {
        return row >= 0 && row < N && col >= 0 && col < M;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
