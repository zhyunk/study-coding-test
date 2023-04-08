package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }
}