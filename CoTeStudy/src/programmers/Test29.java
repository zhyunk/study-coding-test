package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test29 {
    public int[] solution(int[] arr) {
        return Arrays
                .stream(arr)
                .boxed()
                .flatMapToInt(
                        i -> IntStream
                                .range(0, i)
                                .map(n -> i)
                )
                .toArray();
    }

    public Test29() {
        // 예제1 _ 확인할 결과 값 : [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
        int[] a = {5, 1, 4};

        System.out.println(Arrays.toString(this.solution( a )));
    }
}
