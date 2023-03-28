package programmers;

public class Test12 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        // 여벌옷이 있는 학생이 도난당한 경우 체크
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -1;
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        // 옷 확인
        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] == -1) continue;

            for (int j = 0; j < lost.length; j++) {
                if (lost[j] == -1) continue;
                if (Math.abs(reserve[i] - lost[j]) == 1) {
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }


    public Test12(int notUse) {

        // 예제1 _ 확인할 결과 값 :
        int a = 5;
        int[] b = {2,6,8,9};
        int[] c = {1, 6, 7,9};
        System.out.println(this.solution( a, b,c ));
    }
}
