package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test02 {
    public Test02(ArrayList list) {
        if ((int)list.get(0) == 1)  this.solution( (int[])list.get(1), (int[][])list.get(2) );
        else                            this.test( (int[])list.get(1), (int[][])list.get(2) );
    }

    /** list.get(0) = 1 (solution: 제출용) */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        return answer;
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public int[] test(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] arg : commands) {
            int[] list = Arrays.copyOfRange(array, arg[0] - 1, arg[1]);
            Arrays.sort(list);
            answer[idx++] = list[arg[2] - 1];
        }

        return answer;
    }
}
