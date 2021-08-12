package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2007년
 * https://www.acmicpc.net/problem/1924
 */
public class Number1924 {

    private static int[] dayCnt = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] dayName = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());
        int sum = 0;
        for (int i = 0; i < x - 1; i++) {
            sum += dayCnt[i];
        }
        sum += y;
        System.out.println(dayName[sum % 7]);
    }

}