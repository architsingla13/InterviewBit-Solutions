package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 10/10/18
 * Time - 1:17 PM
 */
public class Stringoholics {

    final int M = (int) 1e9+7;

    int maxLenSubString(String t){
        int[] lps = new int[t.length()];
        lps[0] = 0;
        int len = 0;
        int n = t.length();
        int i =1;
        int max= 0;

        while(i<n){
            if(t.charAt(i) == t.charAt(len)){
                len++;
                lps[i] = len;
                i++;
                max = Math.max(max,len);
            }
            else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }
                else{
                    len = lps[len-1];
                }
            }
        }

        return max;
    }

    long pow(long a, long p){

        long ans = 1;
        while(p>0){
            if(p%2L == 1L){
                ans = (ans * a)%M;
            }
            a = (a*a)%M;
            p /= 2;
        }

        return ans%M;
    }

    void updateLcmMap(Map<Integer, Integer> m, Integer num){

        int i = 2;

        while(i<=num && i > 1){
            int count = 0;

            while(num % i == 0){
                count++;
                num /= i;
            }

            if(count == 0){
                i++;
                continue;
            }

            if(m.containsKey(i)){
                int v = m.get(i);
                if(v < count){
                    m.put(i,count);
                }
            }
            else{
                m.put(i,count);
            }

            i++;
        }
    }

    long getLcm(ArrayList<Integer> lens){

        Map<Integer, Integer> m = new HashMap<>();

        for(Integer num : lens){
            updateLcmMap(m, num);
        }

        long prod = 1;
        for(Map.Entry<Integer, Integer> entry : m.entrySet()){

            int k = entry.getKey();
            int v = entry.getValue();

            long p = pow(k,v) % M;

            prod = (prod * p) % M;
        }

        return prod % M;
    }

    public int solve(ArrayList<String> A) {

        ArrayList<Integer> lens = new ArrayList<>();

        for(String t: A){
            int maxLen = maxLenSubString(t);
            int n = t.length();

            if(n%(n-maxLen) == 0){
                n -= maxLen;
            }

            long sum = 0;
            int i =1;
            do{
                sum += i;
                i++;
            }while(sum % ((long) n) != 0L);

            lens.add(i-1);
        }

        long lcm = getLcm(lens) % M;

        return (int)lcm % M;
    }

    public static void main(String[] args) {

        ArrayList<String> t = new ArrayList<String>(){{
            add("a");
            add("ababa");
            add("aba");
        }};

        System.out.println(new Stringoholics().solve(t));
    }
}
