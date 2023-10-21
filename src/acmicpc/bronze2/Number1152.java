package acmicpc.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * A+B
 * https://www.acmicpc.net/problem/1000
 */
public class Number1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int wordCount = 0;
        char prevChar = ' ';
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') { // check space
                if (prevChar != ' ') { // if previous char is not space
                    wordCount++;
                }
            }
            if (i == charArray.length - 1) { // reach out to the end of the sentence
                if (prevChar != ' ') {
                    wordCount++;
                }
                break;
            }
            prevChar = charArray[i];
        }
        bw.write(String.valueOf(wordCount));
        bw.flush();
        bw.close();
    }
}
