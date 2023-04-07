package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test13 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

            for (int i = 0; i < arr.length; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                int startX = Integer.parseInt(st.nextToken());
                int startY = Integer.parseInt(st.nextToken());
                int endX = Integer.parseInt(st.nextToken());
                int endY = Integer.parseInt(st.nextToken());

                int answer = 0;
                for (int i = --startX; i < endX; i++) {
                    for (int j = --startY; j < endY; j++) {
                        answer += arr[i][j];
                    }
                }
                System.out.println(answer);
            }
        } catch (Exception e) {
            System.out.printf("err 😭\n\t%s\n\t%s", e.getMessage(), e);
        }
    }

    public Test13() {
        this.main();
        /**
         * 예제 입력
         2 3
         1 2 4
         8 16 32
         3
         1 1 2 3
         1 2 1 2
         1 3 2 3

         * 예제 출력
         63
         2
         36

         **/
    }
}
