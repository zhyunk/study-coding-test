package programmers;

import java.util.ArrayList;

public class Test00 {
    public Test00(ArrayList list) {
        if ((int)list.get(0) == 1)  this.solution( (int[])list.get(1), (int)list.get(2) );
        else                            this.test( (int[])list.get(1), (int)list.get(2) );
    }

    /** list.get(0) = 1 (solution: 제출용) */
    public void solution(int[] arr, int divisor) {
        
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public void test(int[] arr, int divisor) {

    }
}
