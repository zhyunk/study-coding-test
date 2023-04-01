package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test03 {
    public Test03() throws IOException {
        this.main();
    }

    public void main() {
    }
    public void test() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int tot = Integer.parseInt(br.readLine());
            int cnt = Integer.parseInt(br.readLine());
            while (cnt-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                tot -= Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }
            System.out.println(tot == 0 ? "Yes" : "No");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
