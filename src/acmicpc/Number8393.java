package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 합
 * https://www.acmicpc.net/problem/8393
 */
public class Number8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
