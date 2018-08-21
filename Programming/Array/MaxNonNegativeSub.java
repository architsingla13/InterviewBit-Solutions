package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 20/08/18
 * Time - 11:55 PM
 */
public class MaxNonNegativeSub {

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {

        ArrayList<Integer> result = new ArrayList<>();
        int left = -1, right = -1;
        long max = Integer.MIN_VALUE;
        int count = 0;

        long sum = 0;
        int L = 0 , R;

        for(int i=0; i< A.size(); i++){

            if(A.get(i) < 0){
                sum=0;
                L = i+1;
            }
            else{
                sum += A.get(i);
                R = i;

                if(sum > max || (sum == max && count < (R-L+1))){
                    max = sum;
                    left= L;
                    right = R;
                    count = R-L+1;
                }
            }
        }

        if(left != -1 && right !=-1){
            for(int i=left;i<=right;i++){
                result.add(A.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(756898537);
        l.add(-1);
        l.add(-1);
        l.add(1540383426);

        System.out.println(new MaxNonNegativeSub().maxset(l));
    }
}
