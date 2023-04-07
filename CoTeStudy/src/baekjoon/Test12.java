package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test12 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            LinkedList<String> q = new LinkedList<>();
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                String line = br.readLine();
                if (line.contains("push")) {
                    q.offer(line.split(" ")[1]);
                } else if ("pop".equals(line)) {
                    System.out.println(q.isEmpty() ? -1 : q.poll());
                } else if ("size".equals(line)) {
                    System.out.println(q.size());
                } else if ("empty".equals(line)) {
                    System.out.println(q.isEmpty() ? 1 : 0);
                } else if ("front".equals(line)) {
                    System.out.println(q.isEmpty() ? -1 : q.getFirst());
                } else if ("back".equals(line)) {
                    System.out.println(q.isEmpty() ? -1 : q.getLast());
                }
            }
        } catch (IOException e) {
            System.out.printf("err 😭\n\t%s\n\t%s", e.getMessage(), e);
        }
    }

    public Test12() {
        this.main();

        /**
         * 예제 입력
15
push 1
push 2
front
back
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
front

         * 예제 출력
         1
         2
         2
         0
         1
         2
         -1
         0
         1
         -1
         0
         3

         * */
    }
}
