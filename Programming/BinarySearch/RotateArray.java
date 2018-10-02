package BinarySearch;

import java.util.List;

/**
 * Author - archit.s
 * Date - 02/10/18
 * Time - 10:36 AM
 */
public class RotateArray {

    int rotateBSearch(List<Integer> A){
        int low = 0;
        int high = A.size()-1;

        int n = A.size();

        while(low <= high){

            int mid = low + (high - low)/2;

            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;

            if(A.get(low) <= A.get(high)){
                return A.get(low);
            }
            else if((A.get(mid) <= A.get(next)) && (A.get(mid) <= A.get(prev))){
                return A.get(mid);
            }
            else if(A.get(mid) >= A.get(low)){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public int findMin(final List<Integer> a) {

        return rotateBSearch(a);
    }
}
