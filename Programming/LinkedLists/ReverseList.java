package LinkedLists;

/**
 * Author - archit.s
 * Date - 17/10/18
 * Time - 12:22 PM
 */
public class ReverseList {
    public ListNode reverseList(ListNode A) {

        ListNode prev = null;
        ListNode current = A;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
