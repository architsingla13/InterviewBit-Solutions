package LinkedLists;

/**
 * Author - archit.s
 * Date - 18/10/18
 * Time - 12:02 PM
 */
public class Merge2SortedLists {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode head = null;
        ListNode last = null;

        while(A!=null && B!=null){

            if(A.val <= B.val){
                if(head == null){
                    head = A;
                    last = head;
                }
                else{
                    last.next = A;
                    last = last.next;
                }
                A = A.next;
            }
            else{
                if(head == null){
                    head = B;
                    last = head;
                }
                else{
                    last.next = B;
                    last = last.next;
                }
                B = B.next;
            }
        }

        if(A!=null){
            last.next  = A;
        }
        else if(B!=null){
            last.next  = B;
        }

        return head;
    }
}
