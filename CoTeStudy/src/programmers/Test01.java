package programmers;

import java.util.ArrayList;
import utils.MyPrint;

public class Test01 {
    /** list.get(0) = 1 (solution: 제출용) */
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public void test(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        MyPrint.arr(answer);
    }

    public Test01() {
//        복붙할 배열 만들기
//        System.out.println("[100, 95, 2, 4, 5, 6, 18, 33, 948] [[100, 95, 2, 4, 5, 6, 18, 33, 948]]".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 : [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
        int [] a = new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948};
        int b = 3;
        this.solution( a, b );
    }
}
