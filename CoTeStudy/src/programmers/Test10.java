package programmers;

public class Test10 {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (char c: s.toCharArray()) {
            int idx = index;
            while (idx > 0) {
                if (c == 'z') c = 'a';
                else c++;

                if (skip.contains(c + "")) continue;
                idx--;
            }
            answer += c;
        }
        return answer;
    }

    public Test10(int launcher) {
        // 예제1 _ 확인할 결과 값 : happy
        String a = "aukks";
        String b = "wbqd";
        int c = 5;

        System.out.println(this.solution( a , b, c ));
    }
}
