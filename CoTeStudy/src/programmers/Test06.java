package programmers;

import java.util.*;

public class Test06 {
    /** list.get(0) = 1 (solution: 제출용) */
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> q = new LinkedList();

        return answer;
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public int test(int[] priorities, int location) {
        int answer = 0;

        // 우선순위 목록을 큐에 담는다.
        // 형태 : int[]{ 우선순위, 목표물이면 1 목표물 아니면 0}
        Queue<int[]> q = new LinkedList();
        for (int i = 0; i < priorities.length; i++) {
            if (i == location) q.add(new int[]{priorities[i], 1});
            else               q.add(new int[]{priorities[i], 0});
        }

        // 우선순위가 높은 순서부터 뽑아야 하기때문에 정렬
        // 내림차순 대신 거꾸로 인덱스방향을 진행하기 위해 order 변수 생성
        // -> Arrays.sort()로 내림차순 하려면 배열 새로 만들어야됨 (int[] -> Integer())
        Arrays.sort(priorities);
        int order = priorities.length - 1;

        // 목표물 찾아서 출력
        while (!q.isEmpty()) {
            int[] priority = q.poll();

            if (priority[0] == priorities[order]) {
                answer++;
                order--;

                if (priority[1] == 1) break;
            } else {
                q.add(priority);
            }
        }
        return answer;
    }

    public Test06(int launcher) {

        // 예제1 _ 확인할 결과 값 :
        int[] a = new int[]{2, 1, 3, 2}; // 1
        a = new int[]{1, 1, 9, 1, 1, 1}; // 5

        int b = 2;
        b = 0;

        if (launcher == 1)  System.out.println(this.solution( a, b ));
        else                    System.out.println(this.test( a, b ));
    }
}
