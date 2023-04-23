package programmers;
import java.util.Scanner;

public class Test25 {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char c: a.toCharArray()) {
            int sign = c > 'Z' ? -1 : 1;

            System.out.print((char)(c + ('a' - 'A') * sign));
        }
    }


    public Test25() {
//        입력값 : aBcDeFg
        // 예제1 _ 확인할 결과 값 : AbCdEfG

        solution();
    }
}
