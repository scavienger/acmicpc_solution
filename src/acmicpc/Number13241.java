package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최소공배수
 * https://www.acmicpc.net/problem/13241
 */
public class Number13241 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        long a = Integer.valueOf(st.nextToken());
        long b = Integer.valueOf(st.nextToken());
        System.out.println(a * b / gcd(a, b));
    }

    // Greatest Common Divisor
    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}