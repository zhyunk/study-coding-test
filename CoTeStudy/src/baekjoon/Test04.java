package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test04 {
    public Test04(int launcher) throws IOException {
        if (launcher == 1)  this.main();
        else                this.test();

    }

    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer sz = new StringTokenizer(br.readLine());

    }
    public void test() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int b = Integer.parseInt(br.readLine());
            System.out.println("long ".repeat(b / 4) + "int");
        } catch(IOException e) {}
    }
}
