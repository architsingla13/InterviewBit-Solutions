package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 09/11/18
 * Time - 4:57 PM
 */
public class ShortestUniquePrefix {

    class TrieNode{

        boolean isUnique;
        Map<Character, TrieNode> map;

        public TrieNode(){
            map = new HashMap<>();
            isUnique = true;
        }

        public void insert(TrieNode head, String s){

            if(head == null){
                return;
            }

            TrieNode cur = head;
            for(int i=0;i<s.length();i++){
                Character c = s.charAt(i);
                if(!cur.map.containsKey(c)){
                    cur.map.put(c, new TrieNode());
                }
                else{
                    cur.map.get(c).isUnique = false;
                }
                cur = cur.map.get(c);
            }
        }


        public String getUnique(TrieNode head, String s){

            StringBuilder temp = new StringBuilder();

            if(head == null){
                return temp.toString();
            }

            TrieNode cur = head;

            for(int i=0;i<s.length();i++){
                Character c = s.charAt(i);
                temp.append(c);
                if(cur.map.containsKey(c) && cur.map.get(c).isUnique){
                    return temp.toString();
                }
                cur = cur.map.get(c);
            }

            return temp.toString();
        }
    }


    public ArrayList<String> prefix(ArrayList<String> A) {

        TrieNode head = new TrieNode();
        TrieNode t = new TrieNode();

        for(String temp: A){
            t.insert(head, temp);
        }

        ArrayList<String> r = new ArrayList<>();

        for(String temp : A){
            r.add(t.getUnique(head, temp));
        }

        return r;
    }
}
