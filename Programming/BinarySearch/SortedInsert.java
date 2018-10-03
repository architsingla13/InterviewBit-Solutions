package BinarySearch;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 03/10/18
 * Time - 12:05 AM
 */
public class SortedInsert {

    int bSearch(ArrayList<Integer> a, int b){
        int start = 0;
        int end = a.size()-1;

        if(a.get(0) > b){
            return 0;
        }
        if(a.get(end) < b){
            return end+1;
        }

        int mid;
        while(start<=end){
            mid = start + (end - start)/2;

            if(a.get(mid) == b){
                return mid;
            }
            else if(a.get(mid) > b){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return start;
    }

    public int searchInsert(ArrayList<Integer> a, int b) {
        return bSearch(a,b);
    }

}
