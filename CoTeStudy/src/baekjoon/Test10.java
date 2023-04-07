package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[][] tbl = new int[n + 1][n + 1];
            int[][] dp  = new int[n + 1][n + 1];

            for (int i = 1; i < tbl.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j < tbl.length; j++) {
                    tbl[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[1][1] = 1;
            for (int i = 1; i < tbl.length; i++) {
                for (int j = 1; j < tbl.length; j++) {
                    if (tbl[i][j] == 0 || (i == n && j == n)) continue;
                    int move = tbl[i][j];

                    if (j + move < tbl.length) dp[i][j + move] += dp[i][j];
                    if (i + move < tbl.length) dp[i + move][j] += dp[i][j];
                }
            }
            System.out.println(dp[n][n]);

        } catch (IOException e) {
            System.out.println("err 😭 " + e.getCause());
        }
    }

    public Test10() {
        this.main();

        /**
         * 예제 입력


         * 예제 출력


         * ------------

         * 예제 입력



         * 예제 출력


         * */
    }
}
