package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test05 {
    public Test05() {
        this.main();
    }

    public void main() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            // parent
            int[] parent = new int[n + 1];

            // 트리 만들기
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 1; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int childL = Integer.parseInt(st.nextToken());
                int childR = Integer.parseInt(st.nextToken());

                list.get(childL).add(childR);
                list.get(childR).add(childL);
            }

            // 부모 찾기 : BFS (너비 탐색) : Queue 이용
            Queue<Integer> q = new LinkedList<>();
            // 루트 주어진 1 입력
            q.offer(1);
            // q가 빌때 까지 반복문 ㄱ ㄱ
            while(!q.isEmpty()) {
                int now = q.poll(); // 탐색할 노드 꺼냄

                for (int child: list.get(now)) {
                    // 부모를 찾은 자식이면 넘어감
                    if (parent[child] != 0) continue;

                    // 부모가 확인되지 않은 자식이면 now를 부모로 입력
                    parent[child] = now;

                    // 큐에 child 입력
                    q.offer(child);
                }
            }

            for (int i = 2; i <= n; i++) {
                System.out.println(parent[i]);
            }
        } catch(Exception e) {
            System.out.println("e "+ e.getCause());
        }
    }
    public void test() {
        /*
                7
                1 6         // 4
                6 3         // 6
                3 5         // 1
                4 1         // 3
                2 4         // 1
                4 7         // 4
        */
        /*
                12
                1 2         // 1
                1 3         // 1
                2 4         // 2
                3 5         // 3
                3 6         // 3
                4 7         // 4
                4 8         // 4
                5 9         // 5
                5 10        // 5
                6 11        // 6
                6 12        // 6
        */
    }
}
