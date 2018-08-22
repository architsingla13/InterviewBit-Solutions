package Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author - archit.s
 * Date - 22/08/18
 * Time - 12:08 AM
 */
public class NobleInteger {

    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size();){
            int num = A.get(i);
            while(i<A.size() && A.get(i) == num){
                i++;
            }
            if(i-1<A.size() && A.get(i-1) == (A.size()-i)){
                return 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        System.out.println(new NobleInteger().solve(A));
    }
}
