package Math;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 30/09/18
 * Time - 6:53 PM
 */
public class RearrangeArray {

    public void arrange(ArrayList<Integer> a) {

        int n = a.size();

        for(int i=0;i<n;i++){
            a.set(i, a.get(i) + (a.get(a.get(i))%n)*n);
        }

        for(int i=0;i<n;i++){
            a.set(i, (a.get(i)/n));
        }

    }

}
