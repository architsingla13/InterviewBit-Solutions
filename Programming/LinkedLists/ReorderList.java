package LinkedLists;

/**
 * Author - archit.s
 * Date - 19/10/18
 * Time - 6:49 PM
 */
public class ReorderList {

    public ListNode reorderList(ListNode A) {

        ListNode slow = A;
        ListNode fast = A;

        while(fast!=null && fast.next!=null){
            fast = fast.next;
            if(fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
        }

        ListNode l1 = A;
        ListNode l2 = slow.next;

        slow.next = null;

        ListNode current = l2;
        ListNode prev = null;
        ListNode next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        l2 = prev;

        int count = 1;
        ListNode head = l1;
        l1 = l1.next;
        ListNode last = head;

        while(l1!=null && l2!=null){
            if(count%2 == 1){
                last.next = l2;
                l2 = l2.next;
            }
            else{
                last.next = l1;
                l1 = l1.next;
            }
            count++;
            last = last.next;
        }

        if(l1!=null){
            last.next = l1;
        }
        if(l2!=null){
            last.next = l2;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode r = new ListNode(1);
        r.next = new ListNode(2);
        r.next.next = new ListNode(3);
        r.next.next.next = new ListNode(4);


        System.out.println(new ReorderList().reorderList(r));
    }
}
