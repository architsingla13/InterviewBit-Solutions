package Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 30/10/18
 * Time - 1:36 PM
 */
public class WindowString {

    public String minWindow(String A, String B) {

        Map<Character, Integer> reqCountMap = new HashMap<>();
        Map<Character, Integer> windowCountMap = new HashMap<>();

        int tempStart = 0, tempEnd = 0 , minS = -1, minE = Integer.MAX_VALUE-100;

        for(int i=0;i<B.length();i++){
            Character c = B.charAt(i);
            reqCountMap.put(c, reqCountMap.getOrDefault(c,0)+1);
        }

        int reqL = B.length();
        int doneL = 0;

        while(true){


            if(doneL<reqL){

                if (tempEnd == A.length()){
                    break;
                }

                Character c = A.charAt(tempEnd);
                if(reqCountMap.containsKey(c)){
                    windowCountMap.put(c, windowCountMap.getOrDefault(c,0)+1);
                    if(reqCountMap.get(c) >= windowCountMap.get(c)){
                        doneL++;
                    }
                }

                tempEnd++;
            }
            else if(doneL == reqL){

                if((tempEnd-tempStart) < (minE - minS)){
                    minS = tempStart;
                    minE = tempEnd;
                }

                Character c = A.charAt(tempStart);
                int count = windowCountMap.getOrDefault(c,0);
                if(count>0){
                    count--;
                    windowCountMap.put(c, count);

                    if(count < reqCountMap.getOrDefault(c,0)){
                        doneL--;
                    }
                }
                tempStart++;
            }
        }

        StringBuilder s = new StringBuilder();
        if(minS >= 0 ){
            for(int i=minS;i<minE;i++){
                s.append(A.charAt(i));
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(new WindowString().minWindow("ADOBECODEBANC", "ABC"));
    }
}
