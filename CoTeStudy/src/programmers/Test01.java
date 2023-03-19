package programmers;

import java.util.ArrayList;
import utils.MyPrint;

public class Test01 {
    public Test01(ArrayList list) {
        if ((int)list.get(0) == 1) {
            /** list.get(0) = 1 (solution: 제출용) */
            this.solution( (int[])list.get(1), (int)list.get(2) );
        } else {
            /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
            this.test( (int[])list.get(1), (int)list.get(2) );
        }
    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }
    public void test(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        MyPrint.arr(answer);
    }
}
