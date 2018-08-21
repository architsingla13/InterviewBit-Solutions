package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 21/08/18
 * Time - 12:26 AM
 */
public class Spiral2 {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>(A);
        for(int i=0;i<A;i++){
            result.add(new ArrayList<>(A));
            for(int j=0;j<A;j++){
                result.get(i).add(0);
            }
        }


        int left = 0, right = A-1, up = 0 , down = A-1;

        int num = 1;
        while(left <= right && up <= down){

            for(int i=left; i<= right; i++){
                result.get(up).set(i, num);
                num++;
            }
            up++;
            for(int j=up; j<= down; j++){
                result.get(j).set(right, num);
                num++;
            }
            right--;
            for(int i=right; i>= left; i--){
                result.get(down).set(i, num);
                num++;
            }
            down--;
            for(int j=down; j>= up; j--){
                result.get(j).set(left, num);
                num++;
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Spiral2().generateMatrix(4));
    }
}
