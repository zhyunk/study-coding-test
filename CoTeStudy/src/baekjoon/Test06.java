package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test06 {
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 거주민 수 N이 들어올 예정. N은 100만까지 커질 수 있음
        // 이름도 100만이 주어질 수 있음

        // 1. 각 거주민 이름의 각 자리수별로 1과 0의 개수를 셈 --> 1의 개수만 세면 0은 알기 쉬우니 1만 먼저 계산
        int[] ones = new int[20];
        for (int i = 0; i < n; i++) {
            int name = Integer.parseInt(br.readLine());
            for (int j = 0; j < 20; j++) {
                if ((name & (1 << j)) > 0) ones[j]++;
            }
        }

        long answer = 0;
        // 2. 거주민의 친밀도 계산 = (2진수의 각 자리수 값) * (0의 개수) * (1의 개수)
        for (int i = 0; i < 20; i++) {
            answer += ((1l << i) * (n - ones[i]) * ones[i]);
        }

        System.out.println(answer);
    }
    public Test06() throws IOException {
        this.main();
        /**
         * 예제 1. 결과 : 84
         * 5
         * 9
         * 13
         * 1
         * 9
         * 6
         * */
    }
}
