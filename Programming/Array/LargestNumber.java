package Array;

import java.util.*;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 1:01 PM
 */
public class LargestNumber {

    public String largestNumber(final List<Integer> A) {
        List<String> l = new ArrayList<>();

        for (Integer aA : A) {
            l.add(String.valueOf(aA));
        }

        Comparator<String> cmp = (o1, o2) -> {

            String left = o1+o2;
            String right = o2 + o1;
            return right.compareTo(left);
        };

        l.sort(cmp);
        StringBuilder s = new StringBuilder();
        for(int i=0;i<l.size();i++){
            s.append(l.get(i));
        }

        if(s.charAt(0) == '0'){
            return "0";
        }

        return s.toString();
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(0, 0);
        System.out.println(new LargestNumber().largestNumber(A));
    }
}
