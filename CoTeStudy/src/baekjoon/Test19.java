package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test19 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                StringBuilder s = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    a[i][j] += Integer.parseInt(st.nextToken());
                    s.append(a[i][j]).append(" ");
                }
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }

    public Test19() {
        this.main();

/**
* 예제 입력
 3 3
 1 1 1
 2 2 2
 0 1 0
 3 3 3
 4 4 4
 5 5 100

* 예제 출력


* ------------

* 예제 입력



* 예제 출력


* */
    }
}
