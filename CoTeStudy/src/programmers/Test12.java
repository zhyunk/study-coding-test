package programmers;

public class Test12 {
    public int bestSolution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] people = new int[n];

        // 옷을 잃어버린 학생 표시
        for (int i: lost) {
            people[i - 1]--;
        }

        // 여유분의 옷을 가지고 있는 학생 표시
        for (int i: reserve) {
            people[i - 1]++;
        }

        // 체육수업 가능한 학생 체크
        for (int i = 0; i < people.length; i++) {
            // i가 옷을 잃어버린 학생이면
            if (people[i] == -1) {

                if (i - 1 >= 0 && people[i - 1] == 1) {
                    // 바로 앞 학생 확인
                    people[i]++;
                    people[i - 1]--;

                } else if (i + 1 < people.length && people[i + 1] == 1) {
                    // 바로 뒤 학생 확인
                    people[i]++;
                    people[i + 1]--;

                } else {
                    // 옷을 못구함
                    answer--;
                }
            }
        }
        return answer;
    }

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
        System.out.println(this.bestSolution( a, b,c ));
    }
}
