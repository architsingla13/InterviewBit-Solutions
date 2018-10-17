package TwoPointers;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 17/10/18
 * Time - 11:53 AM
 */
public class ContainerMostWater {

    public int maxArea(ArrayList<Integer> A) {
        int area = 0;
        int l = 0;
        int r = A.size()-1;

        while(l<r){

            area = Math.max(area, Math.min(A.get(l),A.get(r))*(r-l));

            if(A.get(l) < A.get(r)){
                l++;
            }
            else{
                r--;
            }
        }

        return area;
    }

}
