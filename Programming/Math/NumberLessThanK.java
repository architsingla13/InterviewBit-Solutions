package Math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 30/09/18
 * Time - 10:52 PM
 */
public class NumberLessThanK {

    public int solve(ArrayList<Integer> A, int B, int C) {

        int cSize = (int) Math.log10(C) + 1;
        int n = A.size();
        if(cSize < B || n == 0){
            return 0;
        }
        boolean zero = false;
        if(A.get(0) == 0){
            zero = true;
        }
        if(cSize > B){
            if(B > 1 && zero){
                return (n-1)* ((int)Math.pow(n, B-1));

            }
            else{
                return (int)Math.pow(n, B);
            }
        }

        int pow10 = (int) Math.pow(10, B-1);
        int count = 0;
        for(int i=B;i>0;i--){

            int target = C/pow10;
            int j=0;
            C %= pow10;
            pow10 /= 10;
            for(j=0;j<n;j++){
                if(A.get(j)>=target){
                    break;
                }
            }

            count += (B > 1 && i == B && zero ? j-1:j) * (int)Math.pow(n, i-1);
            if(j == n || A.get(j) > target)
                break;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberLessThanK().solve(new ArrayList<>(Arrays.asList(0, 1, 3, 4)), 3, 423));
    }
}
