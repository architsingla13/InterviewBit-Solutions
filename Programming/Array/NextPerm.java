package Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author - archit.s
 * Date - 04/09/18
 * Time - 12:28 PM
 */
public class NextPerm {

    private void revSwap(ArrayList<Integer> a, int low, int high){
        while(low<=high){
            int temp = a.get(low);
            a.set(low, a.get(high));
            a.set(high, temp);
            low++;
            high--;
        }
    }

    private int bSearch(ArrayList<Integer> a, int low, int high, int key){

        int index = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(a.get(mid) <= key){
                high = mid -1;
            }
            else{
                low = mid+1;
                if(index == -1 || a.get(index)>=a.get(mid)){
                    index = mid;
                }
            }
        }
        return index;
    }

    public void nextPermutation(ArrayList<Integer> a) {

        int i=a.size()-2;
        while(i>=0 && a.get(i)>= a.get(i+1)){
            i--;
        }

        if(i<0){
            Collections.sort(a);
        }
        else{
            int index = bSearch(a,i+1,a.size()-1,a.get(i));
            int temp = a.get(i);
            a.set(i, a.get(index));
            a.set(index, temp);
            revSwap(a, i+1, a.size()-1);
        }
    }
}
