package BinarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 03/10/18
 * Time - 12:08 PM
 */
public class SearchRange {

    int bSearch(List<Integer> a, int b, boolean searchFirst){

        int low = 0;
        int high = a.size()-1;

        int res = -1;
        while(low <= high){

            int mid = low + (high - low)/2;

            if(a.get(mid) == b){
                res = mid;
                if(searchFirst){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else if(a.get(mid) < b){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return res;
    }

    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(bSearch(a,b,true));
        ans.add(bSearch(a,b,false));

        return ans;
    }
}
