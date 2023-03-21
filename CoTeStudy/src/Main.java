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
         *  luncture     =  1: main     2 : test
         *  argss (프로그래머스 전용) = 사용될 매개변수 순서대로 담음  */

        int site        = 'p';
        int filenumber  = 2;
        int launcher    = 2;

        ArrayList argss = new ArrayList();
        argss.add(launcher);

        /** 이하 프로그래머스로 전달할 매개변수들 */
        argss.add(new int[]{1, 5, 2, 6, 3, 7, 4});
        argss.add(new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
//        argss.add(new String[]{"abc", "a"});
//        argss.add(new String[][]{{"abc", "a"}, {"abc", "b"}});
//        argss.add(2);

        printLectucePractice(site, filenumber, argss);
    }


    private static void printLectucePractice(int site, int fileNumber , ArrayList args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String str = "";

            switch (site) {
                case 'b':
                        str = String.format("baekjoon.Test%02d", fileNumber);
                        Class.forName(str).getDeclaredConstructor(int.class).newInstance(args.get(0));
                    break;
                case 'p':
                    str =  String.format("programmers.Test%02d", fileNumber);
                    Class.forName(str).getDeclaredConstructor(ArrayList.class).newInstance(args);
                    break;
            }
    }
}
