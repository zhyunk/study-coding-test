package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Test02 {
    public Test02() {
        this.main();

    }

    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int cnt = Integer.parseInt(br.readLine());

            while (cnt-- > 0 || br.readLine() != null) {
                StringTokenizer sz = new StringTokenizer(br.readLine());
                bw.write(Integer.parseInt(sz.nextToken()) + Integer.parseInt(sz.nextToken()) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void test() {

    }
}
