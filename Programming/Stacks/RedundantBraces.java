package Stacks;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 24/10/18
 * Time - 11:28 PM
 */
public class RedundantBraces {

    public int braces(String A) {

        Stack<Character> s = new Stack<>();

        for(int i=0;i<A.length();i++){

            if(A.charAt(i) == ' '){
                continue;
            }

            switch(A.charAt(i)){
                case '(':
                case '{':
                case '[':
                    s.push(A.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    char v = s.peek();
                    if(v == '(' || v == '{' || v == '['){
                        return 1;
                    }
                    s.pop();
                    int topElement = v;
                    char sign = s.peek();
                    s.pop();
                    int bottomElement;
                    switch(sign){
                        case '+':
                            bottomElement = s.peek();
                            s.pop();
                            s.pop();
                            s.push((char) (bottomElement + topElement));
                            break;
                        case '-':
                            bottomElement = s.peek();
                            s.pop();
                            s.pop();
                            s.push((char) (bottomElement - topElement));
                            break;
                        case '*':
                            bottomElement = s.peek();
                            s.pop();
                            s.pop();
                            s.push((char) (bottomElement*topElement));
                            break;
                        case '/':
                            bottomElement = s.peek();
                            s.pop();
                            s.pop();
                            s.push((char) (bottomElement/topElement));
                            break;
                        default:
                            return 1;
                    }
                    break;
                default:
                    s.push(A.charAt(i));
            }
        }

        return 0;
    }

}
