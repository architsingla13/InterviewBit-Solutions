package String;

/**
 * Author - archit.s
 * Date - 04/10/18
 * Time - 11:16 PM
 */
public class Palindrome {

    int isAlphaNumeric(String A, int low){

        boolean flag = false;

        if(A.charAt(low) >= 'A' && A.charAt(low) <= 'Z'){
            return 1;
        }
        else if(A.charAt(low) >= 'a' && A.charAt(low) <= 'z'){
            return 2;
        }
        else if(A.charAt(low) >= '0' && A.charAt(low) <= '9'){
            return 3;
        }

        return 0;
    }

    public int isPalindrome(String A) {

        int low = 0;
        int high = A.length()-1;

        while(low<=high){
            char left, right;
            while(low < A.length() && isAlphaNumeric(A,low) == 0){
                low++;
            }

            while(high >= 0 && isAlphaNumeric(A,high) == 0){
                high--;
            }

            if(low == A.length() || high == 0){
                return 1;
            }

            left = A.charAt(low);
            right = A.charAt(high);

            if(isAlphaNumeric(A,low) == 2){
                left = (char)(left - 'a' + 'A');
            }
            if(isAlphaNumeric(A,high) == 2){
                right = (char)(right - 'a' + 'A');
            }

            if(left != right){
                return 0;
            }
            else{
                low++;
                high--;
            }
        }

        return 1;
    }
}
