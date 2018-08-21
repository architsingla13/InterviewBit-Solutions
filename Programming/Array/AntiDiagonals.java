package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 21/08/18
 * Time - 11:51 PM
 */
public class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = A.size();
        int col = 0;
        while(col < n){

            result.add(new ArrayList<>());
            int i = 0, j = col;
            while(i < n && j >= 0){
                result.get(col).add(A.get(i).get(j));
                i++;
                j--;
            }
            col++;
        }

        int row = 1;
        while(row < n){

            result.add(new ArrayList<>());
            int i = row, j = n-1;
            while(i < n && j >= 0){
                result.get(col).add(A.get(i).get(j));
                i++;
                j--;
            }
            col++;
            row++;
        }

        return result;
    }

}
