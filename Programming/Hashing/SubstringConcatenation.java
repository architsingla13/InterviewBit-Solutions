package Hashing;

import java.util.*;

/**
 * Author - archit.s
 * Date - 31/10/18
 * Time - 12:01 PM
 */
public class SubstringConcatenation {

    public ArrayList<Integer> findSubstring(String A, final List<String> B) {

        ArrayList<Integer> r = new ArrayList<>();

        Map<String, Integer> countOriginal = new HashMap<>();
        if(A.length()==0 || B.size() == 0){
            return r;
        }

        int oneWordL = B.get(0).length();
        for (String aB : B) {
            countOriginal.put(aB, countOriginal.getOrDefault(aB, 0) + 1);
        }

        int start = 0;

        while((start+oneWordL*B.size()-1)<A.length()){

            Map<String,Integer> checkMap = new HashMap<>();
            int j = 0;

            while((start + j*oneWordL + oneWordL - 1) < A.length()){

                String temp = A.substring(start + j*oneWordL, start + j*oneWordL + oneWordL);
                if(!countOriginal.containsKey(temp)){
                    break;
                }
                else{
                    int c = checkMap.getOrDefault(temp,0);
                    c++;
                    checkMap.put(temp,c);

                    if(checkMap.get(temp) > countOriginal.get(temp)){
                        break;
                    }

                    j++;
                }

                if(j == B.size()){
                    r.add(start);
                }
            }

            start++;


        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new SubstringConcatenation().findSubstring("barfoothefoobarman",
                new ArrayList<>(Arrays.asList("foo","bar"))));
    }
}
