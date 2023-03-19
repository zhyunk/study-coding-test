import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**      Index
            site 0 : 백준
              01.
              02.
            site 1 : 프로그래머스
              01. 2차원으로 만들기 [https://school.programmers.co.kr/learn/courses/30/lessons/120842]
              02.
*/
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        /*  site         =  b : 백준     p : 프로그래머스
         *  fileNumber   =  1 , 2 , 3 , 4 , .....
         *  luncture     =  1: main     2 : test
         *  argss (프로그래머스 전용) = 사용될 매개변수 순서대로 담음  */

        int site        = 'p';
        int filenumber  = 1;
        int launcher    = 2;

        ArrayList argss = new ArrayList();
        argss.add(launcher);

        /** 이하 프로그래머스로 전달할 매개변수들 */
        argss.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
//        argss.add(new int[][]{{1, 2}});
//        argss.add(new String[]{"abc", "a"});
//        argss.add(new String[][]{{"abc", "a"}, {"abc", "b"}});
        argss.add(2);

        printLectucePractice(site, filenumber, argss);
    }


    private static void printLectucePractice(int site, int fileNumber , ArrayList args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String str = "";

        try {
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
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Err ❌");
            System.out.printf("[ %s ] 없는 파일 ", str);
            System.out.println("❌ --- ❌");
        } catch (NoSuchMethodException e) {
            System.out.println("❌ Err ❌");
            System.out.printf("[ %s ]에서 호출한 \n", str);
            System.out.printf("[ %s ]를 찾을 수 없음 \n", (int)args.get(0) == 1 ? (site == 'b' ? "main()" :  "solution()") : "test()");
            System.out.println("❌ --- ❌");
        } catch (InvocationTargetException e) {
            System.out.println("❌ Err ❌");
            System.out.printf("[ %s ]의 \n", str);
            System.out.printf("[ %s ]에 전달한 매개변수가 잘못됨 \n", (int)args.get(0) == 1 ? (site == 'b' ? "main()" :  "solution()") : "test()");
            System.out.println("❌ --- ❌");
        }
    }
}
