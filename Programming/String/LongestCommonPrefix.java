package String;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 04/10/18
 * Time - 11:35 PM
 */
public class LongestCommonPrefix {

    int common(String A, String B, int min){

        int pos = -1;
        for(int i=0;i<=min;i++){
            if(A.charAt(i) == B.charAt(i)){
                pos=i;
            }
            else{
                return pos;
            }
        }

        return pos;
    }

    public String longestCommonPrefix(ArrayList<String> A) {

        if(A.size()==0){
            return "";
        }
        if(A.size()==1){
            return A.get(0);
        }

        int pos = Integer.MAX_VALUE;
        int min;
        for(int i=1;i<A.size();i++){

            min = Math.min(Math.min(A.get(i-1).length(),A.get(i).length()) - 1, pos);
            pos = common(A.get(i-1), A.get(i), min);
            if(pos == -1){
                return "";
            }
            min = pos;
        }

        return A.get(0).substring(0,pos+1);
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new ArrayList<>(Arrays.asList("abcd", "abde", "ebcf"))));
    }
}
