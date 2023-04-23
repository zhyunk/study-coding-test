package programmers;
import java.util.Scanner;

public class Test24 {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(str.repeat(n));
    }

    public Test24() {
        // 입력값 : string 5
        // 확인할 결과 값 : stringstringstringstringstring
        this.solution();
    }
}
