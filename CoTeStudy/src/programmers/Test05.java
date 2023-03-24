package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test05 {
    /** list.get(0) = 1 (solution: 제출용) _ chatGPT */
    public int solution(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int count = 0;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return (n == 2) ? 1 : count;
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트)  _ chatGPT 코드 학습 (내가 작성했던 코드는 기록용으로 블로그에~~~~🥲)*/
    public int test(int n) {
        // 길이가 n인 배열을 만들고 값을 모두 true로 초기화
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // 하나의 값으로 배열을 채울땐 Arrays.fill()
        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            System.out.println("i = " + i);
            // i가 소수이면
            if (isPrime[i]) {

                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                    System.out.println("\tj = " + j);
                }
            }
        }

        // n = 2?
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        System.out.println("count = " +count);

        return count;
    }

    public Test05(int launcher) {
//        복붙할 배열 만들기
//        System.out.println("[100, 95, 2, 4, 5, 6, 18, 33, 948] [[100, 95, 2, 4, 5, 6, 18, 33, 948]]".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 : 4
        int a = 2;

        try {
            if (launcher == 1)  this.solution( a );
            else                    this.test( a );
        }catch (Exception e) {
            System.out.println("e.getMessage()  : " + e.getMessage());
            System.out.println("e.getCause()    : " + e.getCause());
        }
    }
}
