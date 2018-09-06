package Array;

import java.util.List;

/**
 * Author - archit.s
 * Date - 06/09/18
 * Time - 12:45 PM
 */
public class Nby3Repeat {

    public int repeatedNumber(final List<Integer> a) {

        if(a.size()<3){
            return a.get(0);
        }

        int v1 = Integer.MAX_VALUE;
        int v2 = Integer.MAX_VALUE;
        int count1 = 0;
        int count2 = 0;

        int N = a.size();

        for(int i=0;i<N;i++){

            if(v1 == a.get(i)){
                count1++;
            }
            else if( v2 == a.get(i)){
                count2++;
            }
            else if(count1 == 0){
                v1 = a.get(i);
                count1=1;
            }
            else if(count2 == 0){
                v2 = a.get(i);
                count2 =1;
            }
            else {
                count1-=1;
                count2-=1;
            }

        }

        count1 = 0;
        count2 = 0;

        for (Integer anA : a) {
            if (anA == v1) {
                count1++;
            } else if (v2 == anA) {
                count2++;
            }
        }

        if(count1 > N/3){
            return v1;
        }
        if(count2 > N/3){
            return v2;
        }



        return -1;
    }
}
