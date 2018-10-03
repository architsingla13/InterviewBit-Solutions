package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 02/10/18
 * Time - 11:32 PM
 */
public class MatrixSearch {

    // O(r*(logc))
    /*public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {

        int r = a.size();
        int c = a.get(0).size();

        for(int i=0;i<r;i++){
            if(a.get(i).get(0) <= b && a.get(i).get(c-1) >= b){
                if(Arrays.binarySearch(a.get(i).toArray(),b) >= 0){
                    return 1;
                }
            }
        }

        return 0;
    }*/


    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {

        int r = a.size();
        int c = a.get(0).size();

        int start = 0;
        int end = r*c - 1;

        int x,y;
        int mid;

        while(start<=end){
            mid = start + (end - start)/2;
            x = mid/c;
            y = mid%c;

            if(a.get(x).get(y) == b ){
                return 1;
            }
            else if(a.get(x).get(y) > b ){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }


        return 0;

    }
}
