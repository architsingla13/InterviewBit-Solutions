package Array;

import java.util.LinkedList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 19/08/18
 * Time - 4:42 PM
 */

// Proof:-
// Let us say Ai, Ai+1 … Aj is our optimal solution.
//
//        Note that no prefix of the solution will ever have a negative sum.
//
//        Let us say Ai … Ak prefix had a negative sum.
//
//        Sum ( Ai Ai+1 … Aj ) = Sum (Ai … Ak) + Sum(Ak+1 … Aj)
//
//        Sum ( Ai Ai+1 … Aj) - Sum(Ak+1 … Aj) = Sum(Ai … Ak)
//
//        Now, since Sum(Ai … Ak) < 0,
//
//        Sum (Ai Ai+1 … Aj) - Sum (Ak+1 … Aj) < 0
//
//        which means Sum(Ak+1 … Aj ) > Sum (Ai Ai+1 … Aj)
//
//        This contradicts the fact that Ai, Ai+1 … Aj is our optimal solution.
//
//        Instead, Ak+1, Ak+2 … Aj will be our optimal solution.
//
//        Similarily, you can prove that for optimal solution, it is always good to include a prefix with positive sum.

public class MaxSumContiguous {

    public int maxSubArray(final List<Integer> A) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (Integer aA : A) {
            sum += aA;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }


        return max;
    }

    public static void main(String[] args) {
        List<Integer> A = new LinkedList<>();
        A.add(-2);
        A.add(1);
        A.add(3);
        A.add(4);
        A.add(-1);
        A.add(2);
        A.add(1);
        A.add(-5);
        A.add(4);
        System.out.println(new MaxSumContiguous().maxSubArray(A));
    }
}
