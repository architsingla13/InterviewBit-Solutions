package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Author - archit.s
 * Date - 01/11/18
 * Time - 11:55 AM
 */
public class MagiciansAndChocolates {

    public int nchoc(int A, ArrayList<Integer> B) {

        PriorityQueue<Integer> p = new PriorityQueue<>((x, y) -> y-x);

        for(int b : B){
            p.offer(b);
        }

        long ans = 0;
        long M = (long) 1e9+7;

        while(A>0){
            A--;
            int t = p.poll();
            ans = (ans+t)%M;

            p.offer(t/2);
        }

        ans = ans%M;
        return (int)(ans);
    }
}
