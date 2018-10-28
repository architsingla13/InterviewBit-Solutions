package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 28/10/18
 * Time - 2:48 PM
 */
public class LargestContZero {

    public ArrayList<Integer> lszero(ArrayList<Integer> A) {

        Map<Integer, Integer> map = new HashMap<>();

        int leftIndex = -1, rightIndex = -1;

        int sum = 0 ;

        for(int i=0;i<A.size();i++){

            sum += A.get(i);
            if(A.get(i) == 0){
                if((rightIndex - leftIndex) < 1 ){
                    leftIndex = i;
                    rightIndex = i;
                }
            }

            if(sum == 0){
                if((rightIndex - leftIndex) < (i+1) ){
                    leftIndex = 0;
                    rightIndex = i;
                }
            }
            if(map.containsKey(sum)){
                if((rightIndex - leftIndex) < (i-map.get(sum)-1) ){
                    leftIndex = map.get(sum)+1;
                    rightIndex = i;
                }
            }
            else{
                map.put(sum,i);
            }
        }

        ArrayList<Integer> r = new ArrayList<>();
        if(leftIndex!=-1){
            for(int i=leftIndex;i<=rightIndex;i++){
                r.add(A.get(i));
            }
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new LargestContZero().lszero(new ArrayList<>(Arrays.asList(1,2,-2,4,-4))));
    }
}
