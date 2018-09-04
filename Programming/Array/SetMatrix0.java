package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 04/09/18
 * Time - 1:36 PM
 */
public class SetMatrix0 {

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int rowSize = a.size();
        int colSize = a.get(0).size();

        int[] rows = new int[rowSize];
        Arrays.fill(rows, 0);
        int[] cols = new int[colSize];
        Arrays.fill(cols, 0);

        int rowZero = 0, colZero = 0;

        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                if(a.get(i).get(j) == 0 ){
                    if(i == 0){
                        rowZero = 1;
                    }
                    if(j == 0){
                        colZero = 1;
                    }
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                if(rows[i] == 1 || cols[j] == 1){
                    a.get(i).set(j, 0);
                }
                if(i == 0 && rowZero == 1){
                    a.get(0).set(j, 0);
                }
                if( j == 0 && colZero == 1){
                    a.get(i).set(0, 0);
                }
            }
        }


    }
}
