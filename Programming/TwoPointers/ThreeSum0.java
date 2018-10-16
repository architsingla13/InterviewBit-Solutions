package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Author - archit.s
 * Date - 16/10/18
 * Time - 11:54 AM
 */
public class ThreeSum0 {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();

        Collections.sort(A);

        int  i = 0;
        while(i<A.size()-2){

            int j=i+1;
            int k = A.size()-1;
            while(j<k){

                int temp = A.get(i) + A.get(j) + A.get(k);
                if(temp == 0){
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(A.get(i));
                    t.add(A.get(j));
                    t.add(A.get(k));
                    r.add(t);

                    while(A.get(j).equals(A.get(j+1))){
                        j++;
                        if(j==A.size()-1){
                            break;
                        }
                    }
                    j++;
                }
                else if(temp > 0){
                    while(A.get(k).equals(A.get(k-1))){
                        k--;
                        if(k==0){
                            break;
                        }
                    }
                    k--;
                }
                else{
                    while(A.get(j).equals(A.get(j+1))){
                        j++;
                        if(j==A.size()-1){
                            break;
                        }
                    }
                    j++;
                }
            }

            while(A.get(i).equals(A.get(i+1))){
                i++;
                if(i==A.size()-1){
                    return r;
                }
            }
            i++;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum0().threeSum(new ArrayList<>(Arrays.asList( -4, 2, -1, 1, -4, 2, -5, -3, 2 ))));
    }
}
