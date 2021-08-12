package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 수들의 합2
 * https://www.acmicpc.net/problem/2003
 */
public class Number2003 {
    private static int A[] = new int[10001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = 0;
        int sum = 0;
        int ans = 0;
        while (true) {
            while (sum < m && e < n) {
                sum += A[e++];
            }
            if (sum < m) {
                break;
            }
            if (sum == m) {
                ans++;
                sum -= A[s++];
            }
            while (sum > m && s < e) sum -= A[s++];
            if (sum == m) {
                ans++;
                sum -= A[s++];
            }
        }
        System.out.printf("%d", ans);
    }
}
