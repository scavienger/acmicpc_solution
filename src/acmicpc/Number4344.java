package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 평균은 넘겠지
 * https://www.acmicpc.net/problem/4344
 */
public class Number4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine().trim());
        for (int c = 0; c < C; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int N = Integer.parseInt(st.nextToken());
            int[] grades = new int[N];
            int sum = 0;
            for (int n = 0; n < N; n++) {
                grades[n] = Integer.parseInt(st.nextToken().trim());
                sum += grades[n];
            }
            double avg = sum / N;

            int cnt = 0;
            for (int n = 0; n < N; n++) {
                if (grades[n] > avg) cnt++;
            }
            bw.write(String.format("%.3f", (double) cnt / N * 100));
            bw.write("%\n");
        }

        bw.flush();
        bw.close();
    }
}

