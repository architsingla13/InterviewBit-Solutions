package LinkedLists;

/**
 * Author - archit.s
 * Date - 20/10/18
 * Time - 7:19 PM
 */
public class ListCycle {

    public ListNode detectCycle(ListNode a) {

        ListNode slow = a;
        ListNode fast = a;

        while(fast!=null && fast.next!=null){
            fast = fast.next;
            if(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
            if(fast==slow){
                break;
            }
        }

        if(fast==slow){
            slow = a;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }
        return null;
    }
}
