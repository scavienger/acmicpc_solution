package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * 최솟값 찾기
 * https://www.acmicpc.net/problem/11003
 */
public class Number11003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        final int N = Integer.parseInt(st.nextToken()); // array size
        final int L = Integer.parseInt(st.nextToken()); // window size

        st = new StringTokenizer(br.readLine().trim());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        for (int n = 0; n < N; n++) {
            arr[n] = Integer.parseInt(st.nextToken());
            while (!deque.isEmpty() && arr[deque.peekLast()] > arr[n]) {
                deque.pollLast();
            }
            deque.offer(n);
            if (n - deque.peekFirst() >= L) {
                deque.pollFirst();
            }
            sb.append(arr[deque.peekFirst()]).append(' ');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}