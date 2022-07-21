package com.acmicpc.algorithm.P03;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A + B - 5
 */
public class Q10952 {
    public static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        /*
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                if( A == 0 && B == 0){
                    break;
                }
                sb.append(A + B).append(NEW_LINE);
            }
        */

        String line;
        while((line = br.readLine()) != null){
            int A = line.charAt(0) - '0';
            int B = line.charAt(2) - '0';

            if( A == 0 && B == 0){
                break;
            }
            sb.append(A + B).append(NEW_LINE);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
