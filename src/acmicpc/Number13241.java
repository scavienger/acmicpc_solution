package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number13241 {

    private static long A;
    private static long B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        A = Integer.valueOf(st.nextToken());
        B = Integer.valueOf(st.nextToken());
        System.out.println(A * B / gcd(A, B));
    }

    // Greatest Common Divisor
    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}