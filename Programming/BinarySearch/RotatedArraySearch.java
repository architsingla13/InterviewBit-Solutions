package BinarySearch;

import java.util.List;

/**
 * Author - archit.s
 * Date - 03/10/18
 * Time - 12:02 PM
 */
public class RotatedArraySearch {

    int bSearch(List<Integer> a, int b){
        int low = 0;
        int high = a.size()-1;

        int n = a.size();

        while(low<=high){

            int mid = low + (high-low)/2;

            if(a.get(mid) == b){
                return mid;
            }
            else if(a.get(low) <= a.get(mid)){
                if(b >= a.get(low) && b<= a.get(mid)){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(b <= a.get(high) && b >= a.get(mid)){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }

        return -1;
    }

    public int search(final List<Integer> a, int b) {

        return bSearch(a,b);
    }
}
