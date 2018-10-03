package BinarySearch;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 03/10/18
 * Time - 1:30 PM
 */
public class PainterPartition {

    int getMax(ArrayList<Integer> C){
        int max = C.get(0);

        for(int i=1;i<C.size();i++){
            if(C.get(i) > max){
                max = C.get(i);
            }
        }

        return max;
    }

    int getSum(ArrayList<Integer> C){
        int sum = 0;

        for(int i=0;i<C.size();i++){
            sum += C.get(i);
        }

        return sum;
    }

    int numberOfPainters(ArrayList<Integer> C, int maxLen){

        int totalLen = 0;

        int number = 1;

        for(int i=0;i<C.size();i++){
            totalLen += C.get(i);

            if(totalLen > maxLen){
                totalLen = C.get(i);
                number++;
            }
        }

        return number;
    }


    public int paint(int A, int B, ArrayList<Integer> C) {

        int low = getMax(C);
        int high = getSum(C);

        long sol = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low)/2;

            int number = numberOfPainters(C, mid);

            if(number <= A){
                sol = Math.min(sol, mid);
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }

        return (int)((sol*(long)B) % 10000003);
    }
}
