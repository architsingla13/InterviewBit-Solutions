package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 18/08/18
 * Time - 1:54 PM
 */
public class MinSteps {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {

        int n = A.size();
        int result = 0;

        for (int i = 0; i < n-1; i++) {
            final int DistA = Math.abs(A.get(i + 1) - A.get(i));
            final int DistB = Math.abs(B.get(i + 1) - B.get(i));
            if(A.get(i + 1).equals(A.get(i))){
                result += DistB;
            }
            else if (B.get(i+1).equals(B.get(i))){
                result += DistA;
            }
            else{
                if(DistB < DistA){
                    result += DistA;
                }
                else {
                    result += DistB;
                }
            }
        }
        return result;
    }
}
