package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test16 {
    static int full, start, goal, up, down;
    static int[] visited;

    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            full  = Integer.parseInt(st.nextToken());
            start = Integer.parseInt(st.nextToken());
            goal  = Integer.parseInt(st.nextToken());
            up    = Integer.parseInt(st.nextToken());
            down  = Integer.parseInt(st.nextToken());

            visited = new int[full + 1];

            // bfs
            bfs();

            // 결과 출력
            if (visited[goal] == 0) {
                System.out.println("use the stairs");
            } else {
                System.out.println(visited[goal] - 1);
            }
        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }
    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 1;

        while (!q.isEmpty()) {
            int current = q.poll();

            if (current == goal) {
                break;
            }

            int upF   = current + up;
            int downF = current - down;

            if (upF <= full && visited[upF] == 0) {
                q.offer(upF);
                visited[upF] = visited[current] + 1;
            }

            if (downF >= 1 && visited[downF] == 0) {
                q.offer(downF);
                visited[downF] = visited[current] + 1;
            }
        }
    }

    public Test16() {
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

         **/
    }
}
