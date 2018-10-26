package Backtracking;

/**
 * Author - archit.s
 * Date - 26/10/18
 * Time - 12:16 AM
 */
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class ReverseLinkedList {

    public ListNode reverse(ListNode current, ListNode prev){

        if(current == null){
            return prev;
        }

        ListNode temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
        return reverse(current, prev);
    }

    public ListNode reverseList(ListNode A) {

        if(A == null || A.next == null){
            return A;
        }

        return reverse(A, null);
    }
}
