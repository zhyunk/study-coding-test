import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**      Index
            site 0 : 백준
              01.
              02.
            site 1 : 프로그래머스
              01. 2차원으로 만들기 [https://school.programmers.co.kr/learn/courses/30/lessons/120842]
              02. 정렬 [https://school.programmers.co.kr/learn/courses/30/lessons/42748]
*/
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        /*  site         =  b : 백준     p : 프로그래머스
         *  fileNumber   =  1 , 2 , 3 , 4 , .....
         *  luncture     =  1: main     2 : test         */

        int site        = 'p';
        int filenumber  = 1;
        int launcher    = 2;

        printLectucePractice(site, filenumber, launcher);
    }


    private static void printLectucePractice(int site, int fileNumber , int launcher) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String str = "";

        if (site == 'b')        str = String.format("baekjoon.Test%02d", fileNumber);
        else if (site == 'p')   str = String.format("programmers.Test%02d", fileNumber);

        Class.forName(str).getDeclaredConstructor(int.class).newInstance(launcher);
    }
}
