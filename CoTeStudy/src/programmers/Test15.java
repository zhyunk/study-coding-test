package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test15 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, ArrayList<String>> userTo = new HashMap();
        HashMap<String, Integer> userFrom = new HashMap();
        String from, to;

        for (String id: id_list) {
            userTo.put(id, new ArrayList<>());
            userFrom.put(id, 0);
        }

        for (String repo: report) {
            from = repo.split(" ")[0];
            to = repo.split(" ")[1];
            if (userTo.get(from).contains(to)) continue;

            userTo.get(from).add(to);
            userFrom.put(to, userFrom.get(to) + 1);
        }

        for (String repo: report) {
            from = repo.split(" ")[0];
            to = repo.split(" ")[1];

            if (userFrom.get(to) < k) {
                userTo.get(from).remove(to);
            }
        }

        int idx = 0;
        for (String id: id_list) {
            answer[idx++] = userTo.get(id).size();
        }
        return answer;
    }


    public Test15() {
        // 예제1 _ 확인할 결과 값 :
        String[] a = {"muzi", "frodo", "apeach", "neo"};
        String[] b = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int c = 2;
        System.out.println(Arrays.toString(this.solution( a, b, c )));
    }
}
