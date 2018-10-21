package LinkedLists;

/**
 * Author - archit.s
 * Date - 21/10/18
 * Time - 4:19 PM
 */
public class SortList {
    ListNode getMiddle(ListNode h){

        if(h == null){
            return null;
        }

        ListNode slow = h;
        ListNode fast = h.next;

        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
        }

        return slow;
    }

    ListNode sortedMerge(ListNode left, ListNode right){

        ListNode result = new ListNode(0);
        ListNode last = result;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                last.next = left;
                left = left.next;
            }
            else{
                last.next = right;
                right = right.next;
            }
            last= last.next;
        }

        if(left == null){
            last.next = right;
        }
        if(right == null){
            last.next = left;
        }

        return result.next;
    }

    ListNode mergeSort(ListNode root){

        if(root == null || root.next == null){
            return root;
        }

        ListNode middle = getMiddle(root);
        ListNode nextToMiddle = middle.next;

        middle.next = null;
        ListNode left = mergeSort(root);
        ListNode right = mergeSort(nextToMiddle);

        ListNode result = sortedMerge(left,right);

        return result;
    }

    public ListNode sortList(ListNode A) {

        return mergeSort(A);
    }

    public static void main(String[] args) {

        ListNode r = new ListNode(1);
        r.next = new ListNode(3);
        r.next.next = new ListNode(3);
        r.next.next.next = new ListNode(0);

        System.out.println(new SortList().sortList(r));
    }
}
