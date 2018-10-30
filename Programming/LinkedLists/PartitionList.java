package LinkedLists;

/**
 * Author - archit.s
 * Date - 20/10/18
 * Time - 9:09 PM
 */
public class PartitionList {
    public ListNode partition(ListNode A, int B) {

        ListNode smaller = null;
        ListNode smallerLast = null;
        ListNode larger = null;
        ListNode largerLast = null;

        ListNode current = A;

        while(current!=null){
            if(current.val < B){
                if(smaller == null){
                    smaller = current;
                    smallerLast = smaller;
                }
                else{
                    smallerLast.next = current;
                    smallerLast = smallerLast.next;
                }
            }
            else{
                if(larger == null){
                    larger = current;
                    largerLast = larger;
                }
                else{
                    largerLast.next = current;
                    largerLast = largerLast.next;
                }
            }
            current = current.next;
        }

        if(smaller!=null){
            smallerLast.next = larger;
            largerLast.next = null;
            return smaller;
        }
        largerLast.next = null;
        return larger;
    }
}
