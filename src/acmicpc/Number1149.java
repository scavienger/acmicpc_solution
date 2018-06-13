package acmicpc;

import java.io.*;
import java.util.StringTokenizer;

public class Number1149 {
    private static int[][] A;
    private static int[][] D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        A = new int[1001][3];
        D = new int[1001][3];
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            D[i][0] = Math.min(D[i - 1][1], D[i - 1][2]) + A[i][0];
            D[i][1] = Math.min(D[i - 1][0], D[i - 1][2]) + A[i][1];
            D[i][2] = Math.min(D[i - 1][0], D[i - 1][1]) + A[i][2];
        }
        bw.write("" + Math.min(Math.min(D[N][0], D[N][1]), D[N][2]));
        bw.flush();
        bw.close();
    }
}
