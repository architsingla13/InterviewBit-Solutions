package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 25/10/18
 * Time - 11:41 AM
 */
public class SlidingWindowW {

    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

        ArrayList<Integer> r = new ArrayList<>();

        Deque<Integer> queue = new LinkedList<>();
        int i = 0;
        for(i=0;i<B&&i<A.size();i++){
            int v = A.get(i);

            while(!queue.isEmpty() && A.get(queue.peekLast()) <= v){
                queue.removeLast();
            }
            queue.addLast(i);
        }

        r.add(A.get(queue.peekFirst()));
        while(i<A.size()){
            if(!queue.isEmpty() &&  (i- queue.peekFirst()) >= B){
                queue.removeFirst();
            }

            int newElement = A.get(i);
            while(!queue.isEmpty() && A.get(queue.peekLast()) <= newElement){
                queue.removeLast();
            }
            queue.addLast(i);
            r.add(A.get(queue.peekFirst()));
            i++;
        }

        return r;
    }
}
