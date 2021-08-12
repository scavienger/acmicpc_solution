package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 최댓값
 * https://www.acmicpc.net/problem/2562
 */
public class Number2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int index = -1;
        for (int i = 1; i <= 9; i++) {
            int N = Integer.parseInt(br.readLine().trim());
            if (N > result) {
                result = N;
                index = i;
            }
        }

        bw.write(result + "\n" + index);
        bw.flush();
        bw.close();
    }
}
