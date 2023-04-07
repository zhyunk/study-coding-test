package programmers;

import java.util.*;

public class Test16 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) break;
        }
        return participant[i];
    }


    public Test16() {
//        복붙할 배열 만들기
//        System.out.println("".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"eden", "kiki"};

        System.out.println(this.solution( a, b ));
    }
}
