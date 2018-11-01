package Heaps;

import java.util.*;

/**
 * Author - archit.s
 * Date - 31/10/18
 * Time - 11:33 PM
 */
public class NMaxCombinations {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        PriorityQueue<Integer> p = new PriorityQueue<>();

        A.sort((x, y) -> y - x);
        B.sort((x, y) -> y - x);

        for(int a: A){
            for(int b: B){

                int sum = a+b;
                if(p.size()<A.size()){
                    p.offer(sum);
                }
                else{
                    if(sum > p.peek()){
                        p.poll();
                        p.offer(sum);
                    }
                    else{
                        break;
                    }
                }

            }
        }

        ArrayList<Integer> r = new ArrayList<>(p);

        r.sort((x, y) -> y - x);

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new NMaxCombinations().solve(new ArrayList<>(Arrays.asList(1,4,2,3)), new ArrayList<>(Arrays.asList(2,5,1,6))));
    }

}
