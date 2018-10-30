package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 30/10/18
 * Time - 12:19 PM
 */
public class CopyList {

    class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
    }

    public RandomListNode copyRandomList(RandomListNode head) {

        Map<RandomListNode, RandomListNode> map = new LinkedHashMap<>();

        RandomListNode current = head;

        while(current!=null){
            map.put(current, new RandomListNode(current.label));
            current = current.next;
        }

        RandomListNode newHead = null;
        RandomListNode last = null;

        for(RandomListNode t : map.keySet()){

            if(newHead == null){
                newHead = map.get(t);
                last = map.get(t);
            }
            else{
                last.next = map.get(t);
                last = last.next;
            }
            last.random = map.get(t.random);
        }

        last.next = null;

        return newHead;
    }
}
