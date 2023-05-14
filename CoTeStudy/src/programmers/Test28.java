package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test28 {
    // 모든 문자열들을 순서대로 합친 문자열 만들기
    //  특정 문자열을 포함한 문자열은 제외
    // 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
    // 작성하세오

    public String solution(String[] str_list, String ex) {
        return Arrays
                .stream(str_list)
                .filter(s -> !s.contains(ex))
                .collect(Collectors.joining());
    }


    public Test28() {
        // 예제1 _ 확인할 결과 값 :
        String[] a = {"abc", "def", "ghi"};
        String b = "ef";

        System.out.println(this.solution( a, b ));
    }
}
