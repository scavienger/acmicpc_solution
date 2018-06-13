package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2609 {

    private static int A;
    private static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        A = Integer.valueOf(st.nextToken());
        B = Integer.valueOf(st.nextToken());
        System.out.println(gcd(A, B));
        System.out.println(A * B / gcd(A, B));
    }

    // Greatest Common Divisor
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}