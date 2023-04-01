package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class Test03 {
    /** list.get(0) = 1 (solution: 제출용) */
    public String solution(String[] survey, int[] choices) {
        return null;
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트 - 다른 사람 코드) */
    public void test(String[] survey, int[] choices) {
        String answer = "";

        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};

        HashMap<Character, Integer> point = new HashMap<Character, Integer>();
        for (char[] t : type) {
            point.put(t[0], 0);
            point.put(t[1], 0);
        }

        // 점수 기록
        for (int idx = 0; idx < choices.length; idx++){
            if(choices[idx] > 4){
                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
            } else {
                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
            }
        }

        // 지표 별 점수 비교 후 유형 기입
        for (char[] t : type) {
            answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
        }

        System.out.println(answer);
    }

    /** list.get(0) = 2 (test: 실행 확인 용 테스트 - 내 코드) */
    public void test00(String[] survey, int[] choices) {
        String answer = "";
        String[] arrS = new String[]{"RT","CF","JM","AN"};
        HashMap<String, Integer[]> table = new HashMap();
        for (String s: arrS) {
            table.put(s, new Integer[]{0,0});
        }

        int idx = 0;
        Integer[] temp;
        for (String s: survey) {
            if (choices[idx] != 4) {
                if (s.contains("R"))            temp = table.get("RT");
                else if (s.contains("C"))       temp = table.get("CF");
                else if (s.contains("J"))       temp = table.get("JM");
                else                            temp = table.get("AN");

                int idxType;
                if (s.charAt(0) == 'R' || s.charAt(0) == 'C' || s.charAt(0) == 'J' || s.charAt(0) == 'A' ) {
                    idxType = choices[idx] > 4 ? 1 : 0;
                } else {
                    idxType = choices[idx] > 4 ? 0 : 1;
                }

                if (choices[idx] > 4) {
                    temp[idxType] += choices[idx] - 4;
                } else {
                    temp[idxType] += 4 - choices[idx];
                }
                table.put(s, temp);
            }

            idx++;
        }

        for (String s : arrS) {
            temp = table.get(s);
            System.out.println(Arrays.toString(temp));
            if (temp[0] >= temp[1]) answer += s.charAt(0);
            else answer += s.charAt(1);
        }
        System.out.println(answer);
    }

    public Test03() {

        // 예제1 _ 확인할 결과 값 : TCMA
        String[] a = new String[]{"AN", "CF", "FC", "MJ", "RT", "NA"};
        int[] b = new int[]{5, 3, 3, 2, 7, 5};

        try {
            this.solution( a, b );
        }catch (Exception e) {
            System.out.println("e.getMessage()  : " + e.getMessage());
            System.out.println("e.getCause()    : " + e.getCause());
        }
    }
}
