package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test14 {
    static int F, S, G, U, D;
    static int[] visited;

    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            F = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());
            G = Integer.parseInt(st.nextToken());
            U = Integer.parseInt(st.nextToken());
            D = Integer.parseInt(st.nextToken());

            visited = new int[F + 1];

            bfs();

            if (visited[G] == 0) {
                System.out.println("use the stairs");
            } else {
                System.out.println(visited[G] - 1);
            }

        } catch (Exception e) {
            System.out.printf("err 😭\n\t%s\n\t%s", e.getMessage(), e);
        }
    }
    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(S);
        visited[S] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == G) {
                break;
            }

            int up = current + U;
            int down = current - D;

            if (up <= F && visited[up] == 0) {
                queue.offer(up);
                visited[up] = visited[current] + 1;
            }

            if (down >= 1 && visited[down] == 0) {
                queue.offer(down);
                visited[down] = visited[current] + 1;
            }
        }
    }

    public Test14() {
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
