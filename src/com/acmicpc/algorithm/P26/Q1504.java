package com.acmicpc.algorithm.P26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 특정한 최단 경로 - 골드 4
 * 다익스트라
 */
public class Q1504 {

    static class Node {
        int to;
        int weight;
        Node next;

        public Node(int to, int weight, Node next) {
            this.to = to;
            this.weight = weight;
            this.next = next;
        }

    }

    static Node[] adjList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int E = stringToInt(st.nextToken());

        adjList = new Node[N + 1];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int from = stringToInt(st.nextToken());
            int to = stringToInt(st.nextToken());
            int weight = stringToInt(st.nextToken());

            adjList[from] = new Node(to, weight, adjList[from]);
            adjList[to] = new Node(from, weight, adjList[to]);
        }


    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
