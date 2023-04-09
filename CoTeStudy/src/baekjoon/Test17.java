package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test17 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            // 트리 만들기
            ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                tree.add(new ArrayList<>());
            }
            for (int i = 0; i < n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                tree.get(l).add(r);
                tree.get(r).add(l);
            }

            // 부모 찾기 BFS
            int[] p = new int[n + 1];
            Queue<Integer> q = new LinkedList<>();
            q.offer(1);
            while (! q.isEmpty()) {
                int now = q.poll();

                ArrayList<Integer> child = tree.get(now);
                for (int i = 0;  i < child.size(); i++) {
                    int cur = child.get(i);
                    if (p[cur] != 0) continue;

                    p[cur] = now;
                    q.offer(cur);
                }
            }

            for (int i = 2; i < p.length; i++) {
                System.out.println(p[i]);
            }
        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }

    public Test17() {
        this.main();

        /**
         * 예제 입력
12
1 2
1 3
2 4
3 5
3 6
4 7
4 8
5 9
5 10
6 11
6 12

         * 예제 출력


         * ------------

         * 예제 입력



         * 예제 출력


         * */
    }
}
