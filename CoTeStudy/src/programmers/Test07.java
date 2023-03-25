package programmers;

import java.util.HashSet;

public class Test07 {
    /** list.get(0) = 1 (solution: 제출용) */
    public int solution(int[] nums) {
        int answer = 0;
        return answer;
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public int test(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) {
            set.add(i);
        }
        answer = nums.length / 2 > set.size() ? set.size() : nums.length / 2;
        return answer;
    }

    public Test07(int launcher) {

        // 예제1 _ 확인할 결과 값 :2
        int[] a = {3,1,2,3};

        if (launcher == 1)  System.out.println(this.solution( a ));
        else                    System.out.println(this.test( a ));
    }
}
