package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 01/09/18
 * Time - 5:28 PM
 */
public class RotateMatrix {

    public void rotate(ArrayList<ArrayList<Integer>> a) {

        int up =0 , down = a.size()-1;
        int left = 0, right = down;

        if(down<=0){
            return ;
        }

        while(up<down && left<right){
            int j=0;
            while((up+j)<down){
                int topLeft = a.get(up).get(left+j);
                int topRight = a.get(up+j).get(right);
                int bottomLeft = a.get(down-j).get(left);
                int bottomRight = a.get(down).get(right-j);

                a.get(up).set(left+j, bottomLeft);
                a.get(up+j).set(right, topLeft);
                a.get(down).set(right-j, topRight);
                a.get(down-j).set(left, bottomRight);
                j++;
            }
            up++;
            down--;
            left++;
            right--;
        }
    }
}
