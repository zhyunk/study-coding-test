package programmers;

import java.util.stream.Collectors;

public class Test33 {
    public String solution(String myString) {
        return myString
                .chars()
                .mapToObj(c ->  Character.toString(Integer.max(c, 'l')))
                .collect(Collectors.joining());
    }

    public Test33() {
        // 예제1 _ 확인할 결과 값 : lllllvwxyz
        String a = "abcdevwxyz";

        System.out.println((this.solution( a )));
    }
}
