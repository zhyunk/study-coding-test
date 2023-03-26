package programmers;

public class Test09 {
    /** list.get(0) = 1 (solution: 다른 사람 코드) */
    public int solution(int n) {
        return Integer.parseInt(new StringBuffer(Integer.toString(n, 3)).reverse().toString(), 3);
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트) */
    public int test(int n) {
        int answer = 0;

        int base = 3;
        String samJinSu = makeReverseSamJinSu(n, 1, base, "");

        answer = Integer.parseInt(samJinSu.substring(samJinSu.length()-1));
        for (int i = samJinSu.length() - 2; i >= 0; i--) {
            answer += Integer.parseInt(samJinSu.charAt(i) + "") * base;
            base *= 3;
        }

        return answer;
    }

    String makeReverseSamJinSu(int num, int x, int base, String result) {
        if (num / x < base) {
            result = num / x + result;

            if (num % x != 0) {
                num = num % x;
                x /= base;
            } else {
                return result;
            }
        } else {
            if (!"".equals(result)) result = 0 + result;
            x *= base;
        }

        return makeReverseSamJinSu(num, x, base, result);
    }
    public Test09(int launcher) {
        // 예제1 _ 확인할 결과 값 : 7
        int a = 78413450;

        if (launcher == 1)  System.out.println(this.solution( a ));
        else                    System.out.println(this.test( a ));
    }
}