package programmers;
import utils.MyPrint;

import java.util.Arrays;

public class Test02 {
    /** list.get(0) = 1 (solution: 제출용) */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        return answer;
    }
    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public void test(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] arg : commands) {
            int[] list = Arrays.copyOfRange(array, arg[0] - 1, arg[1]);
            Arrays.sort(list);
            answer[idx++] = list[arg[2] - 1];
        }

        MyPrint.arr(answer);
    }

    public Test02() {
//        복붙할 배열 만들기
//        System.out.println("[100, 95, 2, 4, 5, 6, 18, 33, 948] [[100, 95, 2, 4, 5, 6, 18, 33, 948]]".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 : [5, 6, 3]
        int [] a = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] b = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        try {
            this.solution( a, b );
        }catch (Exception e) {
            System.out.println("e.getMessage()  : " + e.getMessage());
            System.out.println("e.getCause()    : " + e.getCause());
        }
    }

}
