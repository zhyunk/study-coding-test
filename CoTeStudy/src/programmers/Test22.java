package programmers;

import java.util.Arrays;

public class Test22 {
    public int[] solution(int[] arr, int[] delete_list) {
        int length = arr.length;
        for (int i: delete_list) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    arr[j] = 0;
                    length--;
                    break;
                }
            }
        }

        int[] answer = new int[length];
        int idx = 0;
        for(int i: arr) {
            if (i != 0) {
                answer[idx++] = i;
            }
        }
        return answer;
    }


    public Test22() {
        // 예제1 _ 확인할 결과 값 : [110, 66, 439, 785, 1]
        int[] a = {110, 66, 439, 785, 1};
        int[] b = {377, 823, 119, 43};

        System.out.println(Arrays.toString(this.solution(a, b)));
    }
}
