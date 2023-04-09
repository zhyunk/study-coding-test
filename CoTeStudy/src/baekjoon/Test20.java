package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test20 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            boolean[][] arr = new boolean[101][101];
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x  = Integer.parseInt(st.nextToken());
                int y  = Integer.parseInt(st.nextToken());
                for (int i = x; i < x + 10; i++) {
                    for (int j = y; j < y + 10; j++) {
                        if (!arr[i][j]) {
                            arr[i][j] = true;
                            sum++;
                        }
                    }
                }
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }

    public Test20() {
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
