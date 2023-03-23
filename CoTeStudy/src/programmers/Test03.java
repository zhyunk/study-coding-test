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

        // 지표 2차 배열로 생성
        // 각 점수가 매겨지는 지표를 char 타입으로 각각 배열에 담음
        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        // choices 숫자 별 점수를 배열로 등록
        // choices가 1~7 이기 때문에 계산하기 편하게 인덱스 1~7까지 해당되는 점수로 저장
        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};

        // 점수 기록할 배열 생성 : HashMap<Character, Integer> point
        // 점수 기록할 배열 초기화 : 모든 하나의 타입을 key로 하여 value를 0으로 초기화
        HashMap<Character, Integer> point = new HashMap<Character, Integer>();
        for (char[] t : type) {
            point.put(t[0], 0);
            point.put(t[1], 0);
        }

        // 점수 기록
        for (int idx = 0; idx < choices.length; idx++){
            if(choices[idx] > 4){
                // 점수를 별도로 계산할 필요 없이, 위에서 만들어둔 score배열을 바로 가져다가 사용할 수 있음.
                // 단, 이때 점수를 등록할 타입이 0점이 아닐 수 있기때문에 get한 값과 더해서 저장해줌
                // 키는 choices가 4보다 크면 뒤쪽 타입에 대한 값이기 때문에 charAt(1)만 있으면 됨
                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
            } else {
                // 키는 choices가 4보다 작으면 앞쪽 타입에 대한 값이기 때문에 charAt(0)만 있으면 됨
                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
            }
        }

        // 지표 별 점수 비교 후 유형 기입 point에서 t[1]과 t[2]의 값을 비교해서 더 큰 값을 answer에 기록
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

    public Test03(int launcher) {
//        복붙할 배열 만들기
//        System.out.println("[100, 95, 2, 4, 5, 6, 18, 33, 948] [[100, 95, 2, 4, 5, 6, 18, 33, 948]]".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 : TCMA
        String[] a = new String[]{"AN", "CF", "FC", "MJ", "RT", "NA"};
        int[] b = new int[]{5, 3, 3, 2, 7, 5};

        try {
            if (launcher == 1)  this.solution( a, b );
            else                    this.test( a, b );
        }catch (Exception e) {
            System.out.println("e.getMessage()  : " + e.getMessage());
            System.out.println("e.getCause()    : " + e.getCause());
        }
    }
}
