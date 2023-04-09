package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test18 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int F = Integer.parseInt(st.nextToken()); // full
            int S = Integer.parseInt(st.nextToken()); // start
            int G = Integer.parseInt(st.nextToken()); // goal
            int U = Integer.parseInt(st.nextToken()); // up
            int D = Integer.parseInt(st.nextToken()); // down

            int[] chk = new int[F + 1];
            Queue<Integer> q = new LinkedList<>();
            q.offer(S);
            chk[S] = 1;

            while (!q.isEmpty()) {
                int now = q.poll();

                if (now == G) break;

                int up = now + U;
                int down = now - D;

                if (up <= F && chk[up] == 0) {
                    chk[up] = chk[now] + 1;
                    q.offer(up);
                }

                if (down >= 1 && chk[down] == 0) {
                    chk[down] = chk[now] + 1;
                    q.offer(down);
                }
            }

            if (chk[G] == 0) {
                System.out.println("use the stairs");
            } else {
                System.out.println(chk[G] - 1);
            }
        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }

    public Test18() {
        this.main();
/**
* 예제 입력
10 1 10 2 1

* 예제 출력
6

* ------------
* 예제 입력
100 2 1 1 0

* 예제 출력
use the stairs

* */
    }
}
