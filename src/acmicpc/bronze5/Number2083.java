package acmicpc.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 럭비 클럽
 * https://www.acmicpc.net/problem/2083
 */
public class Number2083 {
/*
Joe 16 34
Bill 18 65
Billy 17 65
Sam 17 85
# 0 0
*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        while (true) {
            String input = br.readLine().trim();
            if (input.equals("# 0 0")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(input);
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            String type;
            if (age > 17 || weight >= 80) {
                type = "Senior";
            } else {
                type = "Junior";
            }
            sb = new StringBuilder();
            sb.append(name).append(" ").append(type);
            bw.write(sb + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
