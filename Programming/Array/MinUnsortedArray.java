package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 29/08/18
 * Time - 11:07 PM
 */
public class MinUnsortedArray {

    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {

        int left = -1, right = -1;
        ArrayList<Integer> r = new ArrayList<>();

        for(int i=1;i<A.size();i++){
            if(A.get(i) < A.get(i-1)){
                left = i-1;
                break;
            }
        }

        if(left == -1){
            r.add(-1);
            return r;
        }

        for(int j=A.size()-2;j>=0;j--){
            if(A.get(j) > A.get(j+1)){
                right = j+1;
                break;
            }
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i=left;i<=right;i++){
            if(A.get(i)> max){
                max = A.get(i);
            }
            if(A.get(i) < min){
                min = A.get(i);
            }
        }

        for(int i=0;i<left;i++){
            if(A.get(i) > min){
                left = i;
                break;
            }
        }

        for(int j=A.size()-1;j>=right+1; j--){
            if(A.get(j) < max){
                right = j;
            }
        }


        r.add(left);
        r.add(right);

        return r;
    }
}
