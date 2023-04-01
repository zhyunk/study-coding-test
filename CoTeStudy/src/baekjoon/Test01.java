package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test01 {
    public Test01() throws IOException {
        this.main();
    }

    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] ones = new int[20];
        for (int i = 0; i < n; i++) {
            int name = Integer.parseInt(br.readLine());
            for (int j = 0; j < 20; j++) {
                if ((name & (1 << j)) > 0) ones[j]++;
            }
        }

        long sum = 0L;
        for (int i = 0; i < ones.length; i++) {
            sum += (1L << i) * ones[i] * (n - ones[i]);
        }
        System.out.println(sum);
    }
    public void test() {
        int n = 3;
        String[] s = new String[]{"7", "3", "5"};
        int[] ones = new int[20];
        for (int i = 0; i < n; i++) {
            int name = Integer.parseInt(s[i]);
            for (int j = 0; j < name; j++) {
                if ((name & (1 << j)) > 0) ones[j]++;
            }
        }
        System.out.println("3 & (1 << 0) = " + (3 & (1 << 0)));
        System.out.println("3 & (1 << 1) = " + (3 & (1 << 1)));
        System.out.println("3 & (1 << 2) = " + (3 & (1 << 2)));

        // 이 아랫부분이 아직 미궁.........
        long sum = 0L;
        for (int i = 0; i < ones.length; i++) { // 20은 n의 최대값인 100만이 20자리라서 20
            sum += (1L << i) * ones[i] * (n - ones[i]);
            System.out.println("sum = " + sum);
            System.out.println("ones[i] = " + ones[i]);
        }
        System.out.println(sum);
    }
}
