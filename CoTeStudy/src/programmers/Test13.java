package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test13 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[] arrFailPercent = new float[N + 1];
        float totUserCnt = stages.length;

        // 실패율 계산 1 _ 스테이지별 유저 몇명인지 셈
        for (int i = 0; i < totUserCnt; i++) {
            if (stages[i] == N + 1) continue;
            arrFailPercent[stages[i]]++;
        }

        // 실패율 계산 2 _ 스테이지별 실패율 계산
        for (int i = 1; i < arrFailPercent.length; i++) {
            float nowStageUsers = arrFailPercent[i];

            if (totUserCnt <= 0) arrFailPercent[i] = 0;
            else                 arrFailPercent[i] /= totUserCnt;

            totUserCnt -= nowStageUsers;
        }

        // 실패율 높은 순 출력
        float[] arrOrder = arrFailPercent.clone();
        Arrays.sort(arrOrder);
        int idx = 0;
        for (int i = arrOrder.length - 1; i >= 1; i--) {
            for (int j = 1; j < arrFailPercent.length; j++) {
                if (arrOrder[i] == arrFailPercent[j]) {
                    answer[idx++] = j;
                    arrFailPercent[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }


    public int[] best_solution(int N, int[] lastStages) {
        int nPlayers = lastStages.length;
        int[] nStagePlayers = new int[N + 2];
        for (int stage : lastStages) {
            nStagePlayers[stage] += 1;
        }

        int remainingPlayers = nPlayers;
        List<Stage> stages = new ArrayList<>();
        for (int id = 1 ; id <= N; id++) {
            double failure = (double) nStagePlayers[id] / remainingPlayers;
            remainingPlayers -= nStagePlayers[id];

            Stage s = new Stage(id, failure);
            stages.add(s);
        }
        Collections.sort(stages, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stages.get(i).id;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        public int id;
        public double failure;

        public Stage(int id_, double failure_) {
            id = id_;
            failure = failure_;
        }

        @Override
        public int compareTo(Stage o) {
            if (failure < o.failure ) {
                return -1;
            }
            if (failure > o.failure ) {
                return 1;
            }
            return 0;
        }
    }

    public Test13() {
//        복붙할 배열 만들기
//        System.out.println("".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        int a = 4;
        int[] b = {4, 4, 4, 4, 4};

        System.out.println(this.solution( a, b ));
    }
}
