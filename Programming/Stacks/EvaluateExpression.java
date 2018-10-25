package Stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 24/10/18
 * Time - 11:58 PM
 */
public class EvaluateExpression {

    public int evalRPN(ArrayList<String> A) {

        Stack<Integer> s = new Stack<>();

        for (String aA : A) {
            int t2;
            int t1;
            switch (aA) {
                case "+":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 + t2);
                    break;
                case "-":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 - t2);
                    break;
                case "*":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 * t2);
                    break;
                case "/":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 / t2);
                    break;
                default:
                    s.push(Integer.valueOf(aA));
            }
        }

        return s.pop();
    }
}
