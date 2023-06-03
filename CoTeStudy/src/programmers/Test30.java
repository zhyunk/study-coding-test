package programmers;

import java.util.Arrays;

public class Test30 {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" "))
                .filter(s -> !"".equals(s))
                .toArray(String[]::new);
    }

    public Test30() {
        // 예제1 _ 확인할 결과 값 : [programmers]
        String a = 	"    programmers  ";

        System.out.println(Arrays.toString(this.solution( a )));
    }
}
