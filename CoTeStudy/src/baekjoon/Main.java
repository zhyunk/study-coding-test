package baekjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }
}