package recursive;

public class Sum02 {
    // 짝수 합
    public static void main(String[] args) {
        Sum02 s = new Sum02();

        System.out.println(s.sum(4));
        System.out.println(s.sum(5));
        System.out.println(s.sum(10));
        System.out.println(s.sum(11));
    }
    
    private int sum(int n) {

        if (n % 2 != 0)
            n--;

        return recursive(n, 0);
    }

    private int recursive(int n, int sum) {

        if (n <= 0)
            return sum;

        return recursive(n - 2, n + sum);
    }

}
