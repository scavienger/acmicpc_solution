package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * RGB거리
 * https://www.acmicpc.net/problem/1149
 */
public class Number1149 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] a = new int[1001][3];
        int[][] d = new int[1001][3];
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            d[i][0] = Math.min(d[i - 1][1], d[i - 1][2]) + a[i][0];
            d[i][1] = Math.min(d[i - 1][0], d[i - 1][2]) + a[i][1];
            d[i][2] = Math.min(d[i - 1][0], d[i - 1][1]) + a[i][2];
        }
        bw.write("" + Math.min(Math.min(d[N][0], d[N][1]), d[N][2]));
        bw.flush();
        bw.close();
    }
}
