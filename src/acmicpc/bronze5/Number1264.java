package acmicpc.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 모음의 갯수
 * https://www.acmicpc.net/problem/1264
 */
public class Number1264 {

//    How are you today?
//    Quite well, thank you, how about yourself?
//    I live at number twenty four.
//    #
    public static void main(String[] args) throws IOException {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = 0;
            String str = sc.nextLine();
            if (str.equals("#")) {
                return;
            }
            for (char c : str.toCharArray()) {
                for (char vowel : vowels) {
                    if (c == vowel) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
