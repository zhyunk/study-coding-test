package programmers;

import java.util.Arrays;

public class Test23 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            if (n == num_list.length) {
                n = 0;
            }
            answer[i] = num_list[n++];
        }
        return answer;
    }


    public Test23() {
//        복붙할 배열 만들기
//        System.out.println("".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 : 	[7, 5, 5, 2, 1]
        int[] a = {5, 2, 1, 7, 5};
        int b = 3;

        System.out.println(Arrays.toString(this.solution(a, b)));
    }
}
