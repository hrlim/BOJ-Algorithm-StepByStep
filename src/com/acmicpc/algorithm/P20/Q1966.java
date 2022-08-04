package com.acmicpc.algorithm.P20;

import java.io.*;
import java.util.*;

/**
 * 프린터 큐
 */
public class Q1966 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;

        int T = stringToInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int N = stringToInt(st.nextToken());
            int M = stringToInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.offer(new int[]{i, stringToInt(st.nextToken())});
            }

            int count = 0;

            while(!queue.isEmpty()){
                int[] front = queue.poll();
                boolean isMax = true;

                for (int i = 0; i < queue.size(); i++) {
                    if(front[1] < queue.get(i)[1]){
                        queue.offer(front);
                        for (int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if(!isMax) continue;

                count++;
                if(front[0] == M){
                    break;
                }
            }
            sb.append(count  + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}

