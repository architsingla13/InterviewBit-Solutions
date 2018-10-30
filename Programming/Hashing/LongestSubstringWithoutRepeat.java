package Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 30/10/18
 * Time - 12:55 PM
 */
public class LongestSubstringWithoutRepeat {

    public int lengthOfLongestSubstring(String A) {

        if(A.length()==0){
            return 0;
        }

        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        int temp = 0;

        int s = 0;
        int i = 0;
        while(i<A.length()){

            Character c = A.charAt(i);
            if(map.containsKey(c)){
                int l = map.get(c);
                while(s<=l){
                    map.remove(A.charAt(s));
                    temp--;
                    s++;
                }
            }
            else{
                temp++;
                map.put(c,i);
                i++;
            }
            if(result < temp){
                result = temp;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeat().lengthOfLongestSubstring("dadbc"));
    }
}
