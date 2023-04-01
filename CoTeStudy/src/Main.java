import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**      Index
 *
    site 0 : 백준
 01. 행성 Ｘ３ [https://www.acmicpc.net/problem/2830]
 02. 빠른 A+B [https://www.acmicpc.net/problem/15552]
 05. 트리의 부모 찾기 [https://www.acmicpc.net/problem/11725]
 06. 행성 Ｘ３ [https://www.acmicpc.net/problem/2830]

    site 1 : 프로그래머스
 01. 2차원으로 만들기 [https://school.programmers.co.kr/learn/courses/30/lessons/120842]
 02. 정렬 [https://school.programmers.co.kr/learn/courses/30/lessons/42748]
 03. 성격 유형 검사하기 [https://school.programmers.co.kr/learn/courses/30/lessons/118666]
 04. 문자열 내 p와 y의 개수 [https://school.programmers.co.kr/learn/courses/30/lessons/12916]
 05. 소수 찾기 [https://school.programmers.co.kr/learn/courses/30/lessons/12921]
 06. 프린터 [https://school.programmers.co.kr/learn/courses/30/lessons/42587]
 07. 폰켓몬 [https://school.programmers.co.kr/learn/courses/30/lessons/1845]
 08. 이상한 문자 만들기 [https://school.programmers.co.kr/learn/courses/30/lessons/12930]
 09. 3진법 뒤집기 [https://school.programmers.co.kr/learn/courses/30/lessons/68935]
 10. 둘만의 암호 [https://school.programmers.co.kr/learn/courses/30/lessons/155652]
 11. 자연수 뒤집어 배열로 만들기 [https://school.programmers.co.kr/learn/courses/30/lessons/12932]
 12. 체육복 [https://school.programmers.co.kr/learn/courses/30/lessons/42862]
 13. 실패율 [https://school.programmers.co.kr/learn/courses/30/lessons/42889]
 14. 문자열 내 마음대로 정렬하기 [https://school.programmers.co.kr/learn/courses/30/lessons/12915]
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        /*  site         =  b : 백준     p : 프로그래머스
         *  fileNumber   =  1 , 2 , 3 , 4 , .....           */

        int site        = 'b';
        int filenumber  = 5;

        printLectucePractice(site, filenumber);
    }


    private static void printLectucePractice(int site, int fileNumber) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String str = "";

        if (site == 'b')        str = String.format("baekjoon.Test%02d", fileNumber);
        else if (site == 'p')   str = String.format("programmers.Test%02d", fileNumber);

        Class.forName(str).getDeclaredConstructor().newInstance();
    }
}
