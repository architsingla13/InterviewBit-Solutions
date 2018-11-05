package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Author - archit.s
 * Date - 05/11/18
 * Time - 11:06 AM
 */
public class HotelReviews {

    class TrieNode{

        boolean isEnd;
        Map<Character,TrieNode> map;

        public TrieNode(){
            map = new HashMap<>();
            isEnd = false;
        }

        public void insert(TrieNode head, String s){

            TrieNode cur = head;
            for(int i=0;i<s.length();i++){
                if(!cur.map.containsKey(s.charAt(i))){
                    cur.map.put(s.charAt(i), new TrieNode());
                }
                cur = cur.map.get(s.charAt(i));
            }

            cur.isEnd = true;
        }

        public boolean search(TrieNode head, String s){
            if(head == null){
                return false;
            }
            TrieNode cur = head;
            for(int i=0;i<s.length();i++){
                if(!cur.map.containsKey(s.charAt(i))){
                    return false;
                }
                cur = cur.map.get(s.charAt(i));
            }

            return cur.isEnd;
        }
    }

    public ArrayList<Integer> solve(String A, ArrayList<String> B) {

        TrieNode head = new TrieNode();
        TrieNode t = new TrieNode();

        String[] input = A.split("_");

        for(String temp: input){
            t.insert(head,temp);
        }

        TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<B.size();i++){

            int count = 0;
            input = B.get(i).split("_");
            for(String temp : input){
                if(t.search(head,temp)){
                    count++;
                }
            }

            if(!treeMap.containsKey(count)){
                treeMap.put(count, new ArrayList<>());
            }
            treeMap.get(count).add(i);
        }

        for(int j=treeMap.lastKey();j>=treeMap.firstKey();j--){

            if(treeMap.containsKey(j)){
                result.addAll(treeMap.get(j));
            }
        }

        return result;
    }
}
