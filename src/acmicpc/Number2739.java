package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 구구단
 * https://www.acmicpc.net/problem/2739
 */
public class Number2739 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= 9; i++) {
            bw.write(N + " * " + i + " = " + N * i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
