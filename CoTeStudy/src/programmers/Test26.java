package programmers;

public class Test26 {
    public int solution(int[] num_list) {
        int danwiE = 1, danwiO = 1;
        int e = 0, o = 0;

        for (int i = num_list.length - 1; i >= 0; i--) {
            if (num_list[i] % 2 == 0) {
                e += danwiE * num_list[i];
                danwiE *= 10;
            } else {
                o += danwiO * num_list[i];
                danwiO *= 10;
            }
        }
        return e + o;
    }


    public Test26() {
        // 예제1 _ 확인할 결과 값 : 581
        int[] a = {5, 7, 8, 3};

        System.out.println(this.solution( a ));
    }
}
