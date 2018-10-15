package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 15/10/18
 * Time - 12:05 PM
 */
public class RemoveDuplicates {

    public int removeDuplicates(ArrayList<Integer> a) {

        int i = 0;
        int k = 0;
        while(i<a.size()){
            if(!a.get(i).equals(a.get(k))){
                a.set(k+1, a.get(i));
                k++;
            }
            i++;
        }

        return k+1;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates(new ArrayList<>(Arrays.asList(5000, 5000, 5000))));
    }
}
