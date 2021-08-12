package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * X보다 작은 수
 * https://www.acmicpc.net/problem/10871
 */
public class Number10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        final int N = Integer.parseInt(st.nextToken());
        final int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < N; i++) {
            final int n = Integer.parseInt(st.nextToken());
            if (n < X) {
                bw.write(n + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
