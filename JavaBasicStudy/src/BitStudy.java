public class BitStudy {
    /** 비트 마스크 
     * 이진수 표현을 사용하여 여러 개의 작은 데이터를 하나의 정수로 합쳐 저장하거나,
     * 이들을 분리하는 알고리즘
     * **/
    static void p1() {
        /** 시프트 연산자 <<
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

    private static void p3() {
        int bitset = 0;

        // 원소 추가 (n번째 원소를 추가할 때: bitset |= (1 << n))
        int n = 3;
        bitset |= (1 << n);
        System.out.println("원소 추가: " + bitset);
        System.out.println(Integer.toBinaryString(bitset));
        System.out.println();
        // 원소 제거 (n번째 원소를 제거할 때: bitset &= ~(1 << n))
        n = 3;
        bitset &= ~(1 << n);
        System.out.println("원소 제거: " + bitset);
        System.out.println(Integer.toBinaryString(bitset));
        System.out.println();

        // 원소 토글 (n번째 원소의 상태를 바꿀 때: bitset ^= (1 << n))
        n = 3;
        bitset ^= (1 << n);
        System.out.println("원소 토글: " + bitset);
        System.out.println(Integer.toBinaryString(bitset));
        System.out.println();

        // 원소 확인 (n번째 원소가 있는지 확인할 때: (bitset & (1 << n)) != 0)
        n = 3;
        boolean contains = (bitset & (1 << n)) != 0;
        System.out.println("원소 확인: " + contains);
        System.out.println(Integer.toBinaryString(bitset));
    }

    public static void main(String[] args) {
        p3();
    }
}
