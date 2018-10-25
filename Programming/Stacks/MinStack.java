package Stacks;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 25/10/18
 * Time - 11:26 AM
 */
public class MinStack {

    private Stack<Integer> values = new Stack<>();
    private int minValue = -1;

    public void push(int x) {
        if(values.empty()){
            values.push(x);
            minValue = x;
        }
        else{
            if( x < minValue){
                values.push(2*x - minValue);
                minValue = x;
            }
            else{
                values.push(x);
            }
        }
    }

    public void pop() {

        if(values.empty()){
            return;
        }
        int temp = values.peek();
        values.pop();
        if(temp < minValue){
            minValue = 2*minValue - temp;
        }
    }

    public int top() {
        if(values.empty()){
            return -1;
        }
        if(values.peek()<minValue){
            return minValue;
        }
        return values.peek();
    }

    public int getMin() {
        if(values.empty()){
            return -1;
        }

        return minValue;
    }
}
