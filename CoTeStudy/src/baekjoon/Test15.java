package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Test15 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            // 트리 만들기
            List<List<Integer>> tree = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                tree.add(new ArrayList<Integer>());
            }
            for (int i = 1; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());

                tree.get(left).add(right);
                tree.get(right).add(left);
            }

            // 부모 노드 찾기
            // 루트 = 1, 부모 찾아라 = BSF
            Queue<Integer> q = new LinkedList<>();
            int[] parent = new int[n + 1];
            q.offer(1);
            while (!q.isEmpty()) {
                int curP = q.poll();

                List<Integer> child = tree.get(curP);
                while (child.size() > 0) {
                    int curC = child.remove(0);

                    if (parent[curC] != 0) continue;

                    parent[curC] = curP;
                    q.offer(curC);
                }
            }
            
            // 부모 출력
            for (int i = 2; i <= n; i++) {
                System.out.println(parent[i]);
            }
        } catch (Exception e) {
            System.out.println("err 😭");
            e.printStackTrace();
        }
    }

    public Test15() {
        this.main();

        /**
         * 예제 입력
7
1 6
6 3
3 5
4 1
2 4
4 7

         * 예제 출력
         4
         6
         1
         3
         1
         4

         * ------------

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
         1
         1
         2
         3
         3
         4
         4
         5
         5
         6
         6

         * */
    }
}
