package String;

/**
 * Author - archit.s
 * Date - 05/10/18
 * Time - 12:42 PM
 */
public class MinCharsToPalindrome {

    boolean isPalindrome(String A, int start, int end){

        while(start<=end){
            if(A.charAt(start) != A.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public int solve(String A) {

        int count = 0;
        int end = A.length()-1;

        for(int i=0;i<=end;i++){
            if(isPalindrome(A,0,end-count)){
                break;
            }
            count++;
        }

        return count;
    }

}
