package LinkedLists;

/**
 * Author - archit.s
 * Date - 21/10/18
 * Time - 4:41 PM
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode A) {

        ListNode current = A;
        ListNode head = A;
        ListNode temp;

        ListNode prev = A;

        while(current!=null){
            temp = current.next;
            if(current.val < prev.val){
                ListNode check = head;
                ListNode checkPrev = null;

                while(check!=current){
                    if(check.val > current.val){
                        break;
                    }
                    checkPrev = check;
                    check = check.next;
                }

                if(checkPrev == null){
                    head = current;
                    current.next = check;
                    prev.next = temp;
                    current = temp;
                }
                else{
                    checkPrev.next = current;
                    current.next = check;
                    prev.next = temp;
                    current = temp;
                }
            }
            else{
                prev = current;
                current = temp;
            }
        }

        return head;
    }
}
