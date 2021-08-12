package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 숫자의 개수
 * https://www.acmicpc.net/problem/2577
 */
public class Number2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());

        int result = A * B * C;
        int[] resultArr = new int[10];
        while (result != 0) {
            resultArr[result % 10]++;
            result /= 10;
        }

        for (int i : resultArr) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
