package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 3:37 PM
 */
public class PalindromePartitioning {

    public boolean isPalindrome(String a, int low, int high){

        while(low < high){
            if(a.charAt(low) != a.charAt(high)){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

    public void palindromes(ArrayList<ArrayList<String>> r, String a, int start,
                            ArrayList<String> temp){

        if(start >= a.length()){
            r.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<a.length();i++){
            if(isPalindrome(a,start,i)){
                temp.add(a.substring(start,i+1));
                palindromes(r,a,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }

    }

    public ArrayList<ArrayList<String>> partition(String a) {

        ArrayList<ArrayList<String>> r = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        palindromes(r,a,0,temp);

        return r;
    }
}
