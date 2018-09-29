package Math;

/**
 * Author - archit.s
 * Date - 29/09/18
 * Time - 12:38 PM
 */
public class Palindrome {

    public int isPalindrome(int A) {

        int original = A;
        int t = 0;

        while (A > 0) {
            t = 10 * t;
            t += A % 10;
            A /= 10;
        }

        if (t == original) {
            return 1;
        }

        return 0;

    }
}
