package String;

import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 08/10/18
 * Time - 11:38 PM
 */
public class MultiplyStrings {

    public String multiply(String A, String B) {

        int n1 = A.length();
        int n2 = B.length();

        if(n1 == 0 || n2 == 0){
            return "0";
        }

        int[] temp = new int[n1+n2];
        Arrays.fill(temp, 0);
        int index1 = 0;
        int index2 = 0;
        for(int i=n1-1;i>=0;i--){
            index2 = 0;
            int num1 = A.charAt(i) - '0';

            int carry = 0;

            for(int j=n2-1;j>=0;j--){
                int num2 = B.charAt(j) - '0';

                int v = temp[index1+index2] ;
                int sum = num1*num2 + v + carry;

                carry = sum/10;
                temp[index1+index2] = sum %10 ;

                index2++;
            }

            if(carry > 0){
                temp[index1+index2] += carry;
            }

            index1++;
        }

        int i = temp.length-1;
        while(i>=0 && temp[i] == 0){
            i--;
        }

        if(i==-1){
            return "0";
        }

        StringBuilder s = new StringBuilder();
        while(i>=0){
            s.append(temp[i]);
            i--;
        }

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(new MultiplyStrings().multiply("99", "99"));
    }
}
