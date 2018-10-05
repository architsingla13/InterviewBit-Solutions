package String;

/**
 * Author - archit.s
 * Date - 05/10/18
 * Time - 12:57 PM
 */
public class LongestPalindromeSubString {

    public String longestPalindrome(String A) {

        int start = 0;
        int maxLen = 1;

        if(A.length()==1){
            return A;
        }

        for(int i=1;i<A.length();i++){

            //even length
            int low = i-1;
            int high = i;
            while(low>=0 && high < A.length() && A.charAt(low) == A.charAt(high)){
                low--;
                high++;
            }
            low++;
            high--;
            if(high-low+1 > maxLen){
                start = low;
                maxLen = high-low +1;
            }

            low = i-1;
            high = i+1;

            while(low>=0 && high < A.length() && A.charAt(low) == A.charAt(high)){

                low--;
                high++;
            }
            low++;
            high--;

            if(high-low+1 > maxLen){
                start = low;
                maxLen = high-low +1;
            }
        }

        return A.substring(start, start + maxLen);
    }

}
