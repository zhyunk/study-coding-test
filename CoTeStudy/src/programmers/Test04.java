package programmers;

import utils.MyPrint;

public class Test04 {
    /** list.get(0) = 1 (solution: 제출용) */
    boolean solution(String s) {
        return s.replaceAll("[pP]", "").length() == s.replaceAll("[yY]", "").length();
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public void test(String s) {
        System.out.println(s.replaceAll("[pP]", "").length() == s.replaceAll("[yY]", "").length());
    }

    public Test04() {

        // 예제1 _ 확인할 결과 값 : true
        String a = "pPoooyY";

        try {
            this.solution( a );
        }catch (Exception e) {
            System.out.println("e.getMessage()  : " + e.getMessage());
            System.out.println("e.getCause()    : " + e.getCause());
        }
    }
}
