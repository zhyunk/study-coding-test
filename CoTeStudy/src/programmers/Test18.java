package programmers;

public class Test18 {
    public int solution(int[][] sizes) {
        int maxW = -1, maxH = -1;
        for (int[] s: sizes) {
            maxW = Math.max(maxW, (s[0] < s[1]) ? s[1] : s[0]);
            maxH = Math.max(maxH, (s[0] < s[1]) ? s[0] : s[1]);
        }
        return maxW * maxH;
    }


    public Test18() {
//        복붙할 배열 만들기
//        System.out.println("[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        int[][] a = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(this.solution( a ));
    }
}
