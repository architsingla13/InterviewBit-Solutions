package BinarySearch;

import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 02/10/18
 * Time - 9:56 AM
 */
public class SQRT {

    public int sqrt(int a) {

        if(a < 0){
            return -1;
        }

        long low = 0;
        long high = a;

        while(low <= high){
            long mid = low + (high - low)/2;

            if(mid*mid <= a && (mid+1)*(mid+1) > a){
                return (int)mid;
            }
            else if(mid*mid > a){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return (int)high;
    }

    public static void main(String[] args) {
        int[] a = {1,3,4};
        System.out.println(Arrays.binarySearch(a, 2));
    }

}
