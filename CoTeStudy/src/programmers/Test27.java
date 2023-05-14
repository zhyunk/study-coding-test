package programmers;

import java.util.Arrays;

public class Test27 {
    public int[] solution(int[] num_list) {
        return Arrays
                .stream(num_list)
                .sorted()
                .limit(5)
                .toArray();
    }


    public Test27() {
//        복붙할 배열 만들기
//        System.out.println("".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        int[] a = {12, 4, 15, 46, 38, 1, 14};

        System.out.println(Arrays.toString(this.solution( a )));
    }
}
