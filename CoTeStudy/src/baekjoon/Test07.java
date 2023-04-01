package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test07 {
    public void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            // 1. 트리 만들기
            ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                tree.add(new ArrayList<>());
            }
            for (int i = 1; i < n; i++) {
                StringTokenizer sz = new StringTokenizer(br.readLine());
                int left = Integer.parseInt(sz.nextToken());
                int right = Integer.parseInt(sz.nextToken());

                tree.get(left).add(right);
                tree.get(right).add(left);
            }

            // 2. 여기에서 루트를 1로 지정했을 때 부모를 찾아내기
            int[] parent = new int[n + 1];
            Queue<Integer> q = new LinkedList<>();
            q.offer(1);
            while (!q.isEmpty()) {
                int node = q.poll();

                ArrayList<Integer> nodeP = tree.get(node);
                for (int i = 0; i < nodeP.size(); i++) {
                    if (parent[nodeP.get(i)] != 0) continue;

                    parent[nodeP.get(i)] = node;
                    q.offer(nodeP.remove(i--));
                }
            }

            // 3. 찾은 부모 노드의 2번부터 출력
            for (int i = 2; i < parent.length; i++) {
                System.out.println(parent[i]);
            }
        } catch (IOException e) {

        }
    }

    public Test07() {
        this.main();

        /**
        *
        * 예제 입력
         * 7
         * 1 6
         * 6 3
         * 3 5
         * 4 1
         * 2 4
         * 4 7
         *
         * 예제 출력
         * 4
         * 6
         * 1
         * 3
         * 1
         * 4
         *
         * ---
         *
         * 예제 입력
         * 12
         * 1 2
         * 1 3
         * 2 4
         * 3 5
         * 3 6
         * 4 7
         * 4 8
         * 5 9
         * 5 10
         * 6 11
         * 6 12
         *
         * 예제 출력
         * 1
         * 1
         * 2
         * 3
         * 3
         * 4
         * 4
         * 5
         * 5
         * 6
         * 6
        * */
    }
}
