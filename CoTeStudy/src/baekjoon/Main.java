package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            // 루트를 1이라고 했을 때, 각 노드의 부모를 구하는 프로그램을 작성하세요
            // 트리 구현
            // 주어지는 값은 각 노드(정점)의 간선임.
            // 너비우선 탐색? 깊이 우선 탐색?
            // 출력 : 각 노드의 부모 노드
            int n = Integer.parseInt(br.readLine());
            int[] parent = new int[n + 1];
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            // list 초기화
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<>());
            }

            // 데이터 삽입
            for (int i = 1; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int node1 = Integer.parseInt(st.nextToken());
                int node2 = Integer.parseInt(st.nextToken());

                list.get(node1).add(node2);
                list.get(node2).add(node1);
            }

            // 부모 찾기 : Q 이용
            // 각 노드 큐에 저장
            Queue<Integer> q = new LinkedList<>();
            q.offer(1); // root 입력
            while (!q.isEmpty()) {
                int now = q.poll();

                for (int child: list.get(now)) {

                    if (parent[child] != 0) continue;

                    parent[child] = now;
                    q.offer(child);
                }
            }

            for (int i = 2; i <= n; i++) {
                System.out.println(parent[i]);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}