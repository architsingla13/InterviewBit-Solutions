package TwoPointers;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 14/10/18
 * Time - 9:11 PM
 */
public class MergeSortedLists2 {

    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        int i = 0;
        int j = 0;

        while(i<a.size() && j<b.size()){

            if(a.get(i) >= b.get(j)){
                a.add(i, b.get(j));
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        while (j<b.size()){
            a.add(b.get(j));
            j++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(){{
           add(-4);
           add(3);
        }};

        ArrayList<Integer> b = new ArrayList<Integer>(){{
            add(-2);
            add(-2);
        }};

        new MergeSortedLists2().merge(a,b);
        System.out.println(a);
    }

}
