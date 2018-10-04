package BinarySearch;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 03/10/18
 * Time - 11:41 PM
 */
public class AllocateBooks {

    int getMax(ArrayList<Integer> A){
        int max = A.get(0);

        for(int i=1;i<A.size();i++){
            if(A.get(i) > max){
                max = A.get(i);
            }
        }

        return max;
    }

    int getSum(ArrayList<Integer> A){

        int sum = 0;
        for(int i=0;i<A.size();i++){
            sum += A.get(i);
        }

        return sum;
    }

    int numberOfBooks(ArrayList<Integer> A, int maxLen){

        int totalLen = 0;
        int number = 1;

        for(int i=0;i<A.size();i++){
            totalLen += A.get(i);

            if(totalLen > maxLen){
                number++;
                totalLen = A.get(i);
            }
        }

        return number;
    }

    public int books(ArrayList<Integer> A, int B) {

        if(B > A.size()){
            return -1;
        }

        int low = getMax(A);
        int high = getSum(A);

        long sol = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(numberOfBooks(A,mid) <= B){
                sol = Math.min(mid, sol);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return (int)sol;
    }
}
