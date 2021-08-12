package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 팩토리얼
 * https://www.acmicpc.net/problem/10872
 */
public class Number10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());

        bw.write(fact(N) + "");
        bw.flush();
        bw.close();
    }

    private static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}
