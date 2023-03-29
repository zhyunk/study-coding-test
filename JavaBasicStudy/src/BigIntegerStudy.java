import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerStudy {
    /**
     * BigInteger :  무한에 가까운 정수를 계산할 수 있는 Math에서 제공되는 클래스
     * */


    public static void main(String[] args) {
        BigIntegerStudy study = new BigIntegerStudy();
        
        // 자료형 변환
        study.printChange();

        // 각종 연산
        study.printCalculation();

    }

    private void printCalculation() {
        int a = 5;
        int b = 2;

        // 더하기 .add( BigInteger )
        BigInteger val = BigInteger.valueOf(a).add(BigInteger.valueOf(b));
        System.out.printf( "%d + %d = %d", a, b, val );

        System.out.println();

        // 빼기 .subtract( BigInteger )
        val = BigInteger.valueOf(a).subtract(BigInteger.valueOf(b));
        System.out.printf( "%d - %d = %d", a, b, val );

        System.out.println();

        // 곱하기 .multiply( BigInteger )
        val = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        System.out.printf( "%d * %d = %d", a, b, val );

        System.out.println();

        // 몫 구하는 나누기 .divide( BigInteger )
        val = BigInteger.valueOf(a).divide(BigInteger.valueOf(b));
        System.out.printf( "%d / %d = %d", a, b, val );

        System.out.println();

        // 나머지 구하는 나누기 .mod( BigInteger )
        val = BigInteger.valueOf(a).mod(BigInteger.valueOf(b));
        System.out.printf( "%d %% %d = %d", a, b, val );

        System.out.println();

        // 제곱 .pow( int )
        val = BigInteger.valueOf(a).pow(b);
        System.out.printf( "%d^%d   = %d", a, b, val );

        System.out.println();

        // 루트 .sqrt()
        val = BigInteger.valueOf(25).sqrt();
        System.out.printf( "루트 %d = %d", 25, val );

        System.out.println();

        // 최대공약수 .gcd( BigInteger )
        a = 2;
        b = 4;
        val = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        System.out.printf( "%d 와 %d 의 최대공약수 GCD = %d", a, b, val );
    }

    private void printChange() {
        // 문자열을 BigInteger로 변환
        BigInteger int1 = new BigInteger("12343255429654873873467619865367946238671897326491823648126384570912374962387469187235412673451726345187236457182364518726341802097462983458726983456");

        // 정수를 BigInteger로 변환
        BigInteger int00 = BigInteger.valueOf(Byte.MAX_VALUE); // byte 자료형 입력
        BigInteger int01 = BigInteger.valueOf(Short.MAX_VALUE); // short 자료형 입력
        BigInteger int2 = BigInteger.valueOf(Integer.MAX_VALUE); // int 자료형 입력
        BigInteger int3 = BigInteger.valueOf(Long.MAX_VALUE);// long 자료형 입력

        // 실수를 BigInteger로 변환
        BigDecimal double1 = BigDecimal.valueOf(Float.MAX_VALUE); // float 자료형 입력
        BigDecimal double2 = BigDecimal.valueOf(Double.MAX_VALUE); // double 자료형 입력

        // BigInteger로 변환한 값을 String으로 변환
        System.out.println("String -> Big is extends Number.class ? : " + (int1 instanceof Number));
        System.out.println("String -> Big  : " + int1);
        System.out.println();

        String bInt1 = int1.toString();
        System.out.println("Big -> String is extends String.class ? : " + (bInt1 instanceof String));
        System.out.println("Big -> String  : " + bInt1);
        System.out.println();

        // BigInteger로 변환한 값을 int / long으로 변환
        int bInt00  = int00.byteValue();
        long bInt01 = int01.shortValue();
        int bInt2  = int2.intValue();
        long bInt3 = int3.longValue();

        System.out.println("Big -> byte  : " + bInt00);
        System.out.println("Big -> short : " + bInt01);
        System.out.println("Big -> int  : " + bInt2);
        System.out.println("Big -> long : " + bInt3);
        System.out.println();

        // BigDecimal로 변환한 값을 float / double로 변환
        float bDouble1  = double1.floatValue();
        double bDouble2 = double2.doubleValue();
        System.out.println("Big -> float  : " + bDouble1);
        System.out.println("Big -> double : " + bDouble2);
        System.out.println();
    }
}
