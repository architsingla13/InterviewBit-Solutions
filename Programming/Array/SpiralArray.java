package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 17/08/18
 * Time - 12:57 PM
 */
public class SpiralArray {

    public static void main(String[] args) {
        List<ArrayList<Integer>> input = new ArrayList<>();

        input.add(new ArrayList<>());
        input.add(new ArrayList<>());

        for(int i =0 ;i<3;i++){
            input.get(0).add(i);
        }

        for(int i =4 ;i<6;i++){
            input.get(1).add(i);
        }

        System.out.println(new SpiralArray().spiralOrder(input));
    }

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int rowMin = 0;
        int rowMax = A.size()-1;
        int colMin = 0;
        int colMax = A.get(0).size()-1;

        while(rowMin<=rowMax && colMin<=colMax){
            for(int j = colMin; j <= colMax; j++){
                result.add(A.get(rowMin).get(j));
            }
            rowMin++;

            for(int i = rowMin; i <= rowMax; i++){
                result.add(A.get(i).get(colMax));
            }
            colMax--;

            for(int j = colMax; j >= colMin; j--){
                result.add(A.get(rowMax).get(j));
            }
            rowMax--;

            for(int i = rowMax; i >= rowMin; i--){
                result.add(A.get(i).get(colMin));
            }
            colMin++;
        }

        return result;
    }
}
