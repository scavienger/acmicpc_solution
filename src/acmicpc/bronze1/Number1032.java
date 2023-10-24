package acmicpc.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 명령 프롬프트
 * https://www.acmicpc.net/problem/1032
 */
public class Number1032 {
/*
3
config.sys
config.inf
configures

Based on 1 row, go down, then to the right.
*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strs = new String[N];
        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            boolean isSame = true;
            for (int j = 1; j < N; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    isSame = false;
                }
            }
            if (isSame) {
                sb.append(strs[0].charAt(i));
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
