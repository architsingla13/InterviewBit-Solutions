package HashMaps;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 02/11/18
 * Time - 11:26 AM
 */
public class LRU {

    Map<Integer,Integer> map;
    int capacity;
    Deque<Integer> d;

    public LRU(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        d = new LinkedList<>();
    }

    public int get(int key) {

        if(map.containsKey(key)){
            d.remove(key);
            d.addFirst(key);
            return map.get(key);
        }
        else{
            return -1;
        }

    }

    public void set(int key, int value) {

        if(d.size() < capacity){
            if(map.containsKey(key)){
                d.remove(key);
            }
        }
        else{
            if(map.containsKey(key)){
                d.remove(key);
            }
            else{
                int removedKey = d.removeLast();
                map.remove(removedKey);
            }
        }
        map.put(key,value);
        d.addFirst(key);
    }
}
