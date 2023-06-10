package recursive;

public class Sum03 {
    // 11의 배수의 합
    private final int TARGET = 11;

    public static void main(String[] args) {
        Sum03 s = new Sum03();

        System.out.println(s.sum(4));
        System.out.println(s.sum(5));
        System.out.println(s.sum(10));
        System.out.println(s.sum(11));
        System.out.println(s.sum(100));
        System.out.println(s.sum(22));
        System.out.println(s.sum(30));
    }
    
    private int sum(int n) {

        if (n > TARGET && n % TARGET != 0)
            n -= n % TARGET;

        else if (n < TARGET)
            n = 0;

        return recursive(n, 0);
    }

    private int recursive(int n, int sum) {

        if (n <= 0)
            return sum;

        return recursive(n - TARGET, n + sum);
    }

}
