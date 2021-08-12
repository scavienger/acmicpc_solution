package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 다음 순
 * https://www.acmicpc.net/problem/10972
 */
public class Number10972 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = Integer.parseInt(br.readLine().trim());
        final int[] arrNum = new int[N];
        final StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < N; i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
        }

        if (nextPermutation(arrNum)) {
            for (int i = 0; i < N; i++) {
                bw.write(arrNum[i] + " ");
            }
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
    }

    private static boolean nextPermutation(int[] arrNum) {
        // a[i - 1] < a[i] 를 만족하는 제일 첫번째 수 찾기
        int i = arrNum.length - 1;
        while (i > 0 && arrNum[i - 1] >= arrNum[i]) {
            i -= 1;
        }

        // 한번 탐색해야 마지막인지 알 수 있음
        if (i <= 0) {
            return false;
        }
        // a[i-1] < a[j]를 만족하는 첫 번째 수 찾기
        int j = arrNum.length - 1;
        while (arrNum[j] <= arrNum[i - 1]) {
            j -= 1;
        }

        swap(arrNum, i - 1, j);

        j = arrNum.length - 1;
        while (i < j) {
            swap(arrNum, i, j);
            i += 1;
            j -= 1;
        }

        return true;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}