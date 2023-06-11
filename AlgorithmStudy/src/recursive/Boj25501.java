package recursive;

import java.util.Scanner;

public class Boj25501 {
    private static int cnt;
    public static void main(String[] args) {
        Boj25501 b = new Boj25501();

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            String S = scan.next();

            System.out.println(b.isPalindrome(S) + " " + cnt);
        }
    }

    private int recursion(char[] s, int l, int r) {
        cnt++;
        if (l >= r) return 1;
        else if (s[l] != s[r]) return 0;
        return recursion(s, l + 1, r - 1);
    }

    private int isPalindrome(String s) {
        cnt = 0;
        return recursion(s.toCharArray(), 0, s.length() - 1);
    }
}

/*
5
AAA
ABBA
ABABA
ABCA
PALINDROME

1 2
1 3
1 3
0 2
0 1
*/
