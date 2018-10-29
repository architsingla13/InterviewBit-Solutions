package Hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 28/10/18
 * Time - 7:25 PM
 */
public class Anagram {

    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

        Map<ArrayList<Integer>, ArrayList<Integer>> map = new LinkedHashMap<>();

        for(int i=0;i<A.size();i++){
            ArrayList<Integer> t = new ArrayList<>(26);
            for(int k=0;k<26;k++){
                t.add(0);
            }
            String s = A.get(i);
            for(int j=0;j<s.length();j++){
                int pos = (s.charAt(j) - 'a');
                int count = t.get(pos);
                t.set(pos, count+1);
            }
            ArrayList<Integer> value = map.getOrDefault(t, new ArrayList<>());
            value.add(i+1);
            map.put(t,value);
        }

        return new ArrayList<>(map.values());
    }
}
