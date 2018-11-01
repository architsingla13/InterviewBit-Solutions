package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Author - archit.s
 * Date - 01/11/18
 * Time - 12:09 PM
 */
public class MergeKSortedLists {

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode mergeKLists(ArrayList<ListNode> a) {

        ListNode head = null;
        ListNode last = null;

        PriorityQueue<ListNode> p = new PriorityQueue<>((x, y) -> x.val - y.val);

        for(ListNode t: a){
            if(t!=null){
                p.offer(t);
            }
        }

        while(p.size()>0){

            ListNode t = p.poll();

            if(t.next!=null){
                p.offer(t.next);
            }

            if(head == null){
                head = t;
                last = t;
            }
            else{
                last.next = t;
                last = last.next;
            }
        }

        last.next = null;

        return head;
    }
}
