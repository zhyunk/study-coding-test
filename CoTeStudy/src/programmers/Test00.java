package programmers;

import java.util.ArrayList;

public class Test00 {
    public Test00(ArrayList list) {
        if ((int)list.get(0) == 1) {
            /** list.get(0) = 1 (solution: 제출용) */
            this.solution( (int[])list.get(1), (int)list.get(2) );
        } else {
            /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
            this.test( (int[])list.get(1), (int)list.get(2) );
        }
    }
    public void solution(int[] arr, int divisor) {
        
    }
    public void test(int[] arr, int divisor) {

    }
}
