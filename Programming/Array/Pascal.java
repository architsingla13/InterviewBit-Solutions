package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 21/08/18
 * Time - 12:57 AM
 */
public class Pascal {

    public ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<A;i++){
            result.add(new ArrayList<>());
            for(int j=1;j<=i+1;j++){
                if(j<=2){
                    result.get(i).add(1);
                }
                else{
                    result.get(i).add(0);
                }
            }
        }

        if(A>2){
            for(int i=2;i<A;i++){
                result.get(i).set(0, 1);
                for(int j=1;j<i;j++){
                    int one = result.get(i-1).get(j-1);
                    int two = result.get(i-1).get(j);
                    result.get(i).set(j, one+two);
                }
                result.get(i).set(i, 1);
            }
        }

        return result;
    }

}
