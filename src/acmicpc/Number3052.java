package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 나머지
 * https://www.acmicpc.net/problem/3052
 */
public class Number3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] result = new int[42];

        for (int i = 0; i < 10; i++) {
            int idx = Integer.parseInt(br.readLine().trim()) % 42;
            result[idx]++;
        }
        int cnt = 0;
        for (int i = 0; i < 42; i++) {
            if (result[i] != 0) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
