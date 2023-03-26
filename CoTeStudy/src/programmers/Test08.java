package programmers;

public class Test08 {
    /** list.get(0) = 1 (solution: 제출용) */
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split(" ");
        for (int i = 0; i < arr.length; i++) {
            int idx = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) answer += (char)(arr[i].charAt(j) - ('a' - 'A'));
                else            answer += arr[i].charAt(j);
            }
            answer += " ";
        }
        return answer.substring(0, answer.length() - 1);
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public String test(String s) {
        String answer = "";
        s = s.toLowerCase();

        int beforeSpace = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int afterSpace = i;
                int idx = 0;
                for (int j = beforeSpace + 1; j <= afterSpace; j++) {
                    if (s.charAt(j) == ' ' || idx % 2 != 0) answer += s.charAt(j);
                    else answer += (char)(s.charAt(j) - ('a' - 'A'));
                    idx++;
                }
                beforeSpace = afterSpace;
            }
        }
        return answer;
    }

    public Test08(int launcher) {
//        복붙할 배열 만들기
//        System.out.println("".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        String a = "try asddfsfgdoiuert DFGDF dfGS world ";

        if (launcher == 1)  System.out.println(this.solution( a ));
        else                    System.out.println(this.test( a ));
    }
}
