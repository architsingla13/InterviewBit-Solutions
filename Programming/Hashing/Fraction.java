package Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 30/10/18
 * Time - 11:11 PM
 */
public class Fraction {

    public String fractionToDecimal(int A, int B) {

        long num = A;
        long den = B;

        boolean neg = false;
        if(num < 0 && den < 0){
            num = Math.abs(num);
            den = Math.abs(den);
        }
        else if(num < 0 || den < 0){
            neg = true;
            num = Math.abs(num);
            den = Math.abs(den);
        }

        StringBuilder s = new StringBuilder();
        s.append(num/den);
        num = num%den;

        if(num == 0){
            return s.toString();
        }

        s.append(".");
        boolean repeat = false;
        long rem = num;
        Map<Long, Integer> map = new HashMap<>();

        int index = -1;

        while(rem>0 && !repeat){

            if(map.containsKey(rem)){
                repeat = true;
                index = map.get(rem);
                break;
            }
            else{
                map.put(rem, s.length());
            }

            rem *= 10;
            long temp = rem/den;
            s.append(temp);
            rem %= den;
        }

        if(repeat){
            s.append(')');
            s.insert(index,'(');
        }

        if(neg){
            s.insert(0,'-');
        }

        return s.toString();
    }
}
