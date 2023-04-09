import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy {
    public static void main(String[] args) {
        new StreamStudy().test1();
    }
    
    void test1() {
        String[] strArr = new String[]{"c", "aaa", "fff", "bb"};
        List<String> strList = Arrays.asList(strArr);
        // 🔻 스트림 생성
        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);
        // 알아낸 점 -> 스트림으로 사용하려면 List를 만들어야함


        // 스트림 List 정렬해서 출력하기 : 데이터소스(원 데이터)가 정렬되는것이 아님
        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);

        Integer[] intArr = new Integer[]{234, 1212, 6 ,456, 333, 2};
        List<Integer> intList = Arrays.asList(1,2,3,4);
        Stream<Integer> intStream1 = intList.stream();
        Stream<Integer> intStream2 = Arrays.stream(intArr);
        intStream1.sorted().forEach(System.out::println);
        intStream2.sorted().forEach(System.out::println);


        // 데이터 소스에 결과 반영하기
        strStream2 = Arrays.stream(strArr);
        List<String> sortedList = strStream2.sorted().toList();
        System.out.println(sortedList);
    }
}
