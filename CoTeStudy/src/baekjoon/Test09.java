package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test09 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] <= k && k / arr[i] > 0) {
                    cnt += (k / arr[i]);
                    k -= (k / arr[i]) * arr[i];
                }
            }
            System.out.println(cnt);
        } catch (IOException e) {
            System.out.println("err 😭 " + e.getCause());
        }
    }

    public Test09() {
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
