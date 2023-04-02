package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test08 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            // 1. 트리 만들기
            ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                tree.add(new ArrayList<>());
            }
            for (int i = 0; i < n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());

                tree.get(left).add(right);
                tree.get(right).add(left);
            }
            
            // 부모 노드 찾기
            int[] p = new int[n + 1];
            Queue<Integer> q = new LinkedList<>();
            q.offer(1); // 루트 1로 지정됨
            while (!q.isEmpty()) {
                int cur = q.poll();

                ArrayList<Integer> curTree = tree.get(cur);
                for (int i = 0; i < tree.get(cur).size(); i++) {
                    if (p[curTree.get(i)] != 0) continue;

                    p[curTree.get(i)] = cur;
                    q.offer(curTree.remove(i));
                    i--;
                }
            }

            // 부모 노드 2번부터 출력
            for (int i = 2; i <= n; i++) {
                System.out.println(p[i]);
            }

        } catch (IOException e) {
            System.out.println("err 😭 " + e.getCause());
        }
    }

    public Test08() {
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

         * ---

         * 예제 입력


         * 예제 출력


         * */
    }
}
