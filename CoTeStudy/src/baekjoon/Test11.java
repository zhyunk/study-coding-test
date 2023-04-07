package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test11 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            Stack<String> s = new Stack<>();
            while (n-- > 0) {
                String line = br.readLine();
                if (line.contains("push")) {
                    s.push(line.split(" ")[1]);
                } else if ("top".equals(line)) {
                    System.out.println(s.peek());
                } else if ("size".equals(line)) {
                    System.out.println(s.size());
                } else if ("empty".equals(line)) {
                    System.out.println(s.empty() ? 1 : 0);
                } else if ("pop".equals(line)) {
                    System.out.println(s.empty() ? -1 : s.pop());
                }
            }
        } catch (IOException e) {
            System.out.printf("err 😭\n\t%s\n\t%s", e.getMessage(), e);
        }
    }

    public Test11() {
        this.main();

        /**
         * 예제 입력
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top

         * 예제 출력
         2
         2
         0
         2
         1
         -1
         0
         1
         -1
         0
         3

         * ------------

         * 예제 입력
         7
         pop
         top
         push 123
         top
         pop
         top
         pop

         * 예제 출력
         -1
         -1
         123
         123
         -1
         -1

         * */
    }
}
