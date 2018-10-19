package LinkedLists;

/**
 * Author - archit.s
 * Date - 19/10/18
 * Time - 8:48 PM
 */
public class SwapAlternate {

    public ListNode swapPairs(ListNode A) {

        if(A == null || A.next == null){
            return A;
        }

        ListNode head = null;
        ListNode last = null;
        ListNode current = A;

        ListNode next;

        while(current!=null && current.next !=null){
            ListNode temp = current.next;
            next = temp.next;
            if(head == null){
                head = temp;
                last = temp;
                last.next = current;
            }
            else{
                last.next = temp;
                last = last.next;
                last.next = current;
            }
            last = last.next;
            current = next;
        }
        if(last!=null){
            last.next = current;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode r = new ListNode(1);
        r.next = new ListNode(2);
        r.next.next = new ListNode(3);
        r.next.next.next = new ListNode(4);

        System.out.println(new SwapAlternate().swapPairs(r));
    }
}
