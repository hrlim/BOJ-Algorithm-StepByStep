package com.acmicpc.algorithm.P31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 친구 네트워크 -- 골드 2
 */
public class Q4195 {

    private static int[] parents;
    private static int[] levels;

    private static Map<String, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = stringToInt(br.readLine());

        for (int testCase = 1; testCase <= T ; testCase++) {
            int N = stringToInt(br.readLine());

            parents = new int[N * 2];
            levels = new int[N * 2];

            map = new HashMap<>();

            // find-union 초기화
            makeSet();

            // person 에게 부여할 Id 값
            int id = 0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String firstPerson = st.nextToken();
                String secondPerson = st.nextToken();

                if(!map.containsKey(firstPerson)){
                    map.put(firstPerson, id++);
                }
                if(!map.containsKey(secondPerson)){
                    map.put(secondPerson, id++);
                }

                int firstPersonId = map.get(firstPerson);
                int secondPersonId = map.get(secondPerson);

                union(firstPersonId, secondPersonId);
                System.out.println(levels[findSet(map.get(secondPerson))]);
            }
        }
    }
    private static void makeSet(){
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
            levels[i] = 1;
        }
    }

    private static int findSet(int num){
        if(parents[num] == num) return num;
        return parents[num] = findSet(parents[num]);
    }

    private static int union(int num1, int num2){
        int set1 = findSet(num1);
        int set2 = findSet(num2);
        if(set1 == set2) return 0;

        parents[set2] = set1;
        levels[set1] += levels[set2];

        return levels[set1];
    }

    private static int stringToInt(String s){
        return Integer.parseInt(s);
    }
}
