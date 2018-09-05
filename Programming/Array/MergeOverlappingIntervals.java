package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Author - archit.s
 * Date - 05/09/18
 * Time - 12:41 PM
 */

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

      @Override
      public String toString(){
        return String.format(start + "::" + end);
      }
}

public class MergeOverlappingIntervals {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if(intervals.size() <=1 ){
            return intervals;
        }

        Comparator<Interval> c = (o1, o2) -> {

            int s1 = o1.start;
            int s2 = o2.start;

            return s1-s2;
        };

        intervals.sort(c);

        ArrayList<Interval> r = new ArrayList<>();

        Interval cur = intervals.get(0);

        for(int i=1;i<intervals.size();i++){

            Interval second = intervals.get(i);

            if(second.start <= cur.end){
                cur.end = Math.max(cur.end, second.end);
            }
            else{
                r.add(cur);
                cur = second;
            }
        }

        r.add(cur);

        return r;
    }

    public static void main(String[] args) {
        ArrayList<Interval> r = new ArrayList<>(Arrays.asList(new Interval(1,10), new Interval(2,9), new Interval(3,8), new Interval(23,24), new Interval(25,26)));
        new MergeOverlappingIntervals().merge(r).forEach(System.out::println);
    }
}
