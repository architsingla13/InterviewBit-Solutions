package BitManipulation;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 13/10/18
 * Time - 1:27 PM
 */
public class DifferentBitsSum {

    final int M = (int) 1e9+7;

    public int cntBits(ArrayList<Integer> A) {

        long sum = 0;

        for(int i=31;i>=0;i--){
            long count = 0;
            for(int j=0;j<A.size();j++){
                if((A.get(j)& (1<<i)) == 0){
                    count++;
                }
            }

            sum = (sum + 2L*count*(A.size()-count))%M;
            sum  = sum%M;
        }


        return (int)sum%M;
    }

    public static void main(String[] args) {
        ArrayList<Integer> r = new ArrayList<>();
        r.add(1);
        r.add(3);
        r.add(5);
        System.out.println(new DifferentBitsSum().cntBits(r));
    }
}
