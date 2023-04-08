package programmers;

public class Test19 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0, idx2 = 0;
        for (String g: goal) {
            if (idx1 < cards1.length && g.equals(cards1[idx1])) {
                idx1++;
            } else if (idx2 < cards2.length && g.equals(cards2[idx2])) {
                idx2++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }


    public Test19() {
        // 예제1 _ 확인할 결과 값 :
        String[] a = {"i", "drink", "water"};
        String[] b = {"want", "to"};
        String[] c = {"i", "want", "to", "drink", "water"};

        System.out.println(this.solution( a,b,c ));
    }
}
