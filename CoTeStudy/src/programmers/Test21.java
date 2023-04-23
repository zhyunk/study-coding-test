package programmers;

public class Test21 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 | x2) & (x3 | x4);
    }


    public Test21() {
        // 예제1 _ 확인할 결과 값 : false
        boolean a = true, b = false , c = false , d = false;

        System.out.println(this.solution( a, b, c, d ));
    }
}
