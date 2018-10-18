package LinkedLists;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 18/10/18
 * Time - 11:26 AM
 */
public class Palindrome {

    public int lPalin(ListNode A) {

        Stack<Integer> s = new Stack<>();

        int l = 0;
        ListNode temp = A;
        while(temp!=null){
            l++;
            temp = temp.next;
        }

        boolean odd = false;
        if(l%2 == 1){
            odd = true;
        }

        int count = 0;
        temp = A;
        while(count < l/2){
            count++;
            s.push(temp.val);
            temp = temp.next;
        }
        if(odd){
            temp = temp.next;
            count++;
        }

        while(count<l && temp!=null){
            int t1 = s.peek();
            int t2 = temp.val;

            if(t1!=t2){
                return 0;
            }
            s.pop();
            temp = temp.next;
            count++;
        }

        return 1;
    }
}
