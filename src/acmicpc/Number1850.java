package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 최소공배수
 * https://www.acmicpc.net/problem/1850
 */
public class Number1850 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        long a = Long.valueOf(st.nextToken());
        long b = Long.valueOf(st.nextToken());

        long gcd = gcd(Math.max(a, b), Math.min(a, b));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd; i++) sb.append("1");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    // Greatest Common Divisor
    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}