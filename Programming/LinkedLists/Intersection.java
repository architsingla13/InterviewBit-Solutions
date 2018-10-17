package LinkedLists;

/**
 * Author - archit.s
 * Date - 17/10/18
 * Time - 12:18 PM
 */

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
}

public class Intersection {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {

        int l1 = 0;
        int l2 = 0;

        if(a == null || b == null){
            return null;
        }

        ListNode temp = a;
        while(temp!=null){
            l1++;
            temp = temp.next;
        }
        temp = b;
        while(temp != null){
            l2++;
            temp = temp.next;
        }

        if(l1<l2){
            int count = 0;
            while(count < (l2-l1)){
                b = b.next;
                count++;
            }
        }
        else{
            int count = 0;
            while(count < (l1-l2)){
                a = a.next;
                count++;
            }
        }

        ListNode t1 = a;
        ListNode t2 = b;
        while(t1!= null && t2 != null){
            if(t1 == t2){
                return t1;
            }
            else{
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        return null;
    }
}
