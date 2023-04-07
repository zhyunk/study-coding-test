package programmers;

import java.util.Arrays;

public class Test17 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book.length; j++) {
                if (i == j) continue;
                if(phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        return answer;
    }


    public Test17() {
//        복붙할 배열 만들기
//        System.out.println("".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        String[] a = {"12","123","1235","567","88"};
        int[] b = {};

        System.out.println(this.solution( a ));
    }
}
