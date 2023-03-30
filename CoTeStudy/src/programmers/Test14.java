package programmers;
import java.util.*;

public class Test14 {
    // 다른사람 코드
    public String[] bestSolution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }

    // 내코드
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        char[] temp = new char[strings.length];
        for (int i = 0; i < strings.length; i++) {
            temp[i] = strings[i].charAt(n);
        }
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (!"".equals(strings[j]) && temp[i] == strings[j].charAt(n)) {
                    answer[i] = strings[j];
                    strings[j] = "";
                    break;
                }
            }
        }
        return answer;
    }

    public Test14(int notUse) {

        // 예제1 _ 확인할 결과 값 :
        String[] a = {"abce", "abcd", "cdx"};
        int b = 2;

        System.out.println(Arrays.toString(this.bestSolution( a, b )));
    }
}