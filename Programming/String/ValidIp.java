package String;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 07/10/18
 * Time - 12:59 PM
 */
public class ValidIp {

    String validString(String A, int i,int j,int k){
        StringBuilder s = new StringBuilder();
        s.append(A.substring(0,i));
        s.append(".");
        s.append(A.substring(i,j));
        s.append(".");
        s.append(A.substring(j,k));
        s.append(".");
        s.append(A.substring(k));

        return s.toString();
    }

    boolean isInRange(String A, int start, int end){

        int n = 0;
        int s = start;
        while(start<end){
            int temp = 10*n + A.charAt(start) - '0';
            if((temp - A.charAt(start) + '0')/10 != n){
                return false;
            }
            n = temp;
            start++;
        }

        if(n == 0){
            return (end - s) == 1;
        }
        else if(n > 0 && n <= 255){
            return A.charAt(s) != '0';
        }

        return false;
    }

    boolean isValid(String A, int i,int j,int k){
        return isInRange(A,0,i) && isInRange(A,i,j) && isInRange(A,j,k) && isInRange(A,k,A.length());
    }


    public ArrayList<String> restoreIpAddresses(String A) {

        ArrayList<String> ans = new ArrayList<>();

        int l = A.length();
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                for(int k=j+1;k<l;k++){
                    if(isValid(A,i,j,k)){
                        ans.add(validString(A,i,j,k));
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new ValidIp().restoreIpAddresses("0100100"));
    }
}
