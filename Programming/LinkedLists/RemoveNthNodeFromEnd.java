package LinkedLists;

/**
 * Author - archit.s
 * Date - 18/10/18
 * Time - 12:10 PM
 */
public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode A, int B) {

        ListNode prev = null;
        ListNode slow = A;
        ListNode fast = A;

        int count = 1;

        while(count <= B && fast != null){
            count++;
            fast = fast.next;
        }

        if(fast == null){
            return A.next;
        }

        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;

        return A;
    }
}
