package programmers;

import java.util.ArrayList;

public class Test00 {
    /** list.get(0) = 1 (solution: 제출용) */
    public void solution(int[] arr, int divisor) {
        
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public void test(int[] arr, int divisor) {

    }

    public Test00(int launcher) {
//        복붙할 배열 만들기
//        System.out.println("[100, 95, 2, 4, 5, 6, 18, 33, 948] [[100, 95, 2, 4, 5, 6, 18, 33, 948]]".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        int [] a = new int[]{1, 5, 2, 6, 3, 7, 4};
        int b = 6;

        try {
            if (launcher == 1)  this.solution( a, b );
            else                    this.test( a, b );
        }catch (Exception e) {
            System.out.println("e.getMessage()  : " + e.getMessage());
            System.out.println("e.getCause()    : " + e.getCause());
        }
    }
}
