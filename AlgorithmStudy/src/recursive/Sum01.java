package recursive;

public class Sum01 {
    public static void main(String[] args) {
        Sum01 s = new Sum01();

        System.out.println("1 ~ 2 합 : " + s.recursive(2));
        System.out.println("1 ~ 10 합 : " + s.tailRecursive(10));
        System.out.println("1 ~ 100 합 : " + s.recursive(100));
        System.out.println("1 ~ 1000 합 : " + s.tailRecursive(1000));
//        System.out.println("1 ~ 10000 합" + s.recursive(10000)); // StackOverflowError
    }

    // 꼬리 재귀
    // JVM에서는 꼬리 재귀 최적화( TCO : Tail Call Optimization )를 하지 않기 때문에
    // 일반재귀와 같은 스택 오버플로가 발생한다.
    private long tailRecursive(int n) {
        return sumTailRecursive(n, 0);
    }

    private long sumTailRecursive(int n, int sum) {

        if (n <= 0)
            return sum;

        return sumTailRecursive(n - 1, n + sum);
    }

    // 일반 재귀
    private long recursive(int n) {
        return sumRecursive(n);
    }

    private long sumRecursive(int n) {

        if (n <= 0)
            return 0;

        return n + sumRecursive(n - 1);
    }

}
