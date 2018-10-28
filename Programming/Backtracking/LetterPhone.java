package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 3:05 PM
 */
public class LetterPhone {

    public void generateLetters(ArrayList<String> r, String A, int pos,
                                Map<Character,String> map, StringBuilder temp){

        if(pos == A.length()){
            r.add(new String(temp));
            return;
        }

        String mappedString = map.get(A.charAt(pos));
        for(int t = 0; t<mappedString.length();t++){
            temp.append(mappedString.charAt(t));
            generateLetters(r,A,pos+1,map,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }

    public ArrayList<String> letterCombinations(String A) {

        A.substring(1,1);
        Map<Character,String> map = new HashMap<>();
        map.put('0', "0");
        map.put('1', "1");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        ArrayList<String> r = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        generateLetters(r,A,0,map,s);

        return r;
    }
}
