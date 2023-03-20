public class BitStudy {
    /** 비트 연산자 **/
    static void p1() {
        /** 시프트 연산 <<
         *  << : 수를 왼쪽으로 이동한다는 의미
         *       1 << x 모양으로 많이 사용 됨
         *       예를 들어
         *           1 << 2는 2^2 ,
         *           1 << 1은 2^1 ,
         *           1 << 0은 2^0 임.
         */
        int n = 4;
        System.out.println(Integer.toBinaryString(n)); // 100
        System.out.println((1 << n) - 1);   // 15 = 2^4 - 1
        System.out.println(Integer.toBinaryString((1 << 0) ));  // 1
        System.out.println(Integer.toBinaryString((1 << 6) ));  // 1000000
        System.out.println(1 << 6); // 64 = 2^6
    }

    static void p2() {
        /** & = 비트 단위로 AND 연산 수행
         *      1&1 true  (1)
         *      곱하기.
         *      0x1 = 0
         *      0x0 = 0
         *      1x0 = 0
         *      1x1 = 1
         *  | = 비트 단위로 OR 연산 수행
         *      0|0 false (0)
         *      더하기
         *      0+1 = 1
         *      1+0 = 1
         *      1+1 = 1
         *      0+0 = 0
         *  ^ = 비트 단위로 XOR 연산 수행
         *      0^0 false (0)
         *      1^1 false (0)
         *      같으면 0
         *      다르면 1
         *  ~ = 피연산자의 모든 비트 반전시킴
         *      ~0 true   (1)
         *      ~1 false  (0)
         *      Not
         *      Not0 = 1
         *      Not1 = 0
         * */
        // 2 = 10
        // 3 = 11
        // => 2&3 = 10 = 2
        // => 2|3 = 11 = 3
        System.out.println(2&3);
        System.out.println(2|3);

        System.out.println(Integer.toBinaryString(1000000));


    }

    public static void main(String[] args) {
        p2();
    }

}
