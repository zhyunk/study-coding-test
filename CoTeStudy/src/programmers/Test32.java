package programmers;

import java.util.Arrays;

public class Test32 {
    public int solution(int[] arr1, int[] arr2) {
        int a = arr1.length;
        int b = arr2.length;

        int result = Integer.compare(a, b);
        if (result == 0) {
            a = Arrays.stream(arr1).sum();
            b = Arrays.stream(arr2).sum();

            result = Integer.compare(a, b);
        }

        return result;
    }

    public Test32() {
        // 예제1 _ 확인할 결과 값 : 1
        int[] a = new int[]{100, 17, 84, 1};
        int[] b = new int[]{55, 12, 65, 36};

        System.out.println((this.solution( a, b )));
    }
}
