package LinkedLists;

/**
 * Author - archit.s
 * Date - 20/10/18
 * Time - 6:50 PM
 */
public class Add2Numbers {

    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode head = null;
        ListNode last = null;

        int carry = 0;
        while(A!=null && B!=null){
            int sum = A.val+B.val+carry;
            carry = sum/10;
            sum = sum%10;
            A.val = sum;
            if(head == null){
                head = A;
                last = head;
            }
            else{
                last.next = A;
                last = last.next;
            }

            A = A.next;
            B = B.next;
        }

        ListNode t = (A==null)?B:A;

        while(t!=null){
            int sum = t.val+carry;
            carry = sum/10;
            sum = sum%10;
            t.val = sum;
            last.next = t;
            t = t.next;
            last = last.next;
        }

        if(carry>0){
            last.next = new ListNode(carry);
            last = last.next;
        }

        if(last!=null){
            last.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode r = new ListNode(1);
        ListNode r1 = new ListNode(9);
        r.next = new ListNode(9);
        r.next.next = new ListNode(9);

        System.out.println(new Add2Numbers().addTwoNumbers(r, r1));
    }
}
