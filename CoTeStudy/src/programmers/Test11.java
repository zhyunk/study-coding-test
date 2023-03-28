package programmers;

public class Test11 {
    public int[] solution(long n) {
        int[] answer = new int[(n + "").length()];
        for (int i = 0; i < answer.length; i++, n /= 10) {
            answer[i] = (int)(n % 10);
        }
        return answer;
    }

    public Test11(int notUse) {
//        복붙할 배열 만들기
//        System.out.println("".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 : [5,4,3,2,1]
        int a = 12345;

        System.out.println(this.solution( a ));
    }
}
