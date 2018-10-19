package LinkedLists;

/**
 * Author - archit.s
 * Date - 19/10/18
 * Time - 9:11 PM
 */
public class KReverse {

    public ListNode reverseList(ListNode A, int B) {

        ListNode head = null;
        ListNode last = null;
        ListNode t = A;

        while(t!=null){
            int count = 1;
            ListNode current = t;
            ListNode prev = null;
            ListNode next = null;

            while(count<=B){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            if(head == null){
                head = prev;
                last = t;
            }
            else{
                last.next = prev;
                last = t;
            }
            t = next;
        }

        return head;
    }
}
