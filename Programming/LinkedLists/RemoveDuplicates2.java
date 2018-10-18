package LinkedLists;

/**
 * Author - archit.s
 * Date - 18/10/18
 * Time - 11:53 AM
 */
public class RemoveDuplicates2 {

    public ListNode deleteDuplicates(ListNode A) {
        ListNode head = null;
        ListNode last = null;
        ListNode temp = A;

        while(temp!=null){
            ListNode prev = null;
            while(temp.next != null && temp.val == temp.next.val){
                prev = temp;
                temp = temp.next;
            }

            if(prev != null && prev.val == temp.val){
                temp = temp.next;
            }

            if(temp!=null && (temp.next == null || (temp.val != temp.next.val))){
                if(head == null){
                    head = temp;
                    last = temp;
                }
                else{
                    last.next = temp;
                    last = last.next;
                }
                temp = temp.next;
            }

        }

        if(last != null){
            last.next = null;
        }

        return head;
    }
}
