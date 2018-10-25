package Stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 25/10/18
 * Time - 1:07 PM
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(ArrayList<Integer> A) {

        Stack<Integer> s = new Stack<>();

        int i=0;
        int maxArea = 0;
        int tempArea = 0;

        while(i<A.size()){

            int current = A.get(i);
            if(s.empty() || A.get(s.peek()) <= current ){
                s.push(i);
                i++;
            }
            else{
                int top = s.peek();
                s.pop();

                tempArea = A.get(top) * (s.empty() ? i : (i-s.peek()-1));
                if(maxArea < tempArea){
                    maxArea = tempArea;
                }
            }
        }

        while(!s.empty()){
            int top = s.peek();
            s.pop();

            tempArea = A.get(top) * (s.empty() ? i : (i-s.peek()-1));
            if(maxArea < tempArea){
                maxArea = tempArea;
            }
        }

        return maxArea;
    }
}
