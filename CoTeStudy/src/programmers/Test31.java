package programmers;

import java.util.stream.IntStream;

public class Test31 {
    public int solution(int[] num_list) {
        return Math.max(
                IntStream
                        .range(0, num_list.length)
                        .filter(i -> i % 2 == 0)
                        .map(i -> num_list[i])
                        .sum()
                ,
                IntStream
                        .range(0, num_list.length)
                        .filter(i -> i % 2 != 0)
                        .map(i -> num_list[i])
                        .sum()
        );
    }

    public Test31() {
        // 예제1 _ 확인할 결과 값 : 17
        int[] a = new int[]{4, 2, 6, 1, 7, 6};

        System.out.println((this.solution( a )));
    }
}
