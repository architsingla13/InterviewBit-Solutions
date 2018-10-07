package String;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 06/10/18
 * Time - 7:58 PM
 */
public class ReverseString {
    ArrayList<Integer> firstWord(String a, int pos){
        StringBuilder s = new StringBuilder();
        int l = a.length();
        int start = -1;
        while(pos < l && a.charAt(pos) == ' '){
            pos++;
        }
        start = pos;
        while(pos < l && a.charAt(pos) != ' '){
            pos++;
        }

        ArrayList<Integer> r = new ArrayList<>();
        if(start < l){
            r.add(start);
            r.add(pos);
        }
        else{
            r.add(-1);
            r.add(-1);
        }
        return r;
    }

    public String reverseWords(String a) {
        int s = 0;
        int l = a.length();

        String ans = "";

        while(s < l){

            ArrayList<Integer> temp = firstWord(a,s);
            if(temp.get(0) !=-1){
                int start = temp.get(0);
                int end = temp.get(1);

                if(ans != ""){
                    ans = a.substring(start,end) + " " + ans;
                }
                else{
                    ans = a.substring(start,end) ;
                }
                s = end;
            }
            else{
                break;
            }
        }

        return ans;
    }
}
