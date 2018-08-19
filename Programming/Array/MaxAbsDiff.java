package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 19/08/18
 * Time - 5:31 PM
 */
public class MaxAbsDiff {

//  Solution 1
//  public int maxArr(ArrayList<Integer> A) {
//
//        int max = 0;
//        for (int i = 0; i < A.size(); i++) {
//
//            for (int j = i; j < A.size(); j++) {
//                final int temp = Math.abs(A.get(i) - A.get(j)) + Math.abs(i - j);
//                if( temp > max){
//                    max = temp;
//                }
//            }
//
//        }
//
//
//        return max;
//    }


// Solution 2
// f(i, j) = |A[i] - A[j]| + |i - j| can be written in 4 ways
//
//             (A[i] + i) - (A[j] + j)
//            -(A[i] - i) + (A[j] - j)
//            (A[i] - i) - (A[j] - j)
//            (-A[i] - i) + (A[j] + j) = -(A[i] + i) + (A[j] + j)

    public int maxArr(ArrayList<Integer> A) {

        int maxPlus = Integer.MIN_VALUE, minPlus = Integer.MAX_VALUE;
        int maxMinus = Integer.MIN_VALUE, minMinus = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {

            final int plus = A.get(i) + i;
            if(plus > maxPlus){
                maxPlus = plus;
            }
            if(plus < minPlus){
                minPlus = plus;
            }

            final int minus = A.get(i) - i;
            if(minus > maxMinus){
                maxMinus = minus;
            }
            if(minus < minMinus){
                minMinus = minus;
            }
        }

        return Math.max(maxPlus - minPlus, maxMinus - minMinus);
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(-10);
        A.add(-3);
        A.add(10);

        System.out.println(new MaxAbsDiff().maxArr(A));
    }

}
