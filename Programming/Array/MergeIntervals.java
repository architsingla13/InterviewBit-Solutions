package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 06/09/18
 * Time - 12:04 PM
 */
public class MergeIntervals {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> r = new ArrayList<>();

        Interval prev = newInterval;
        Interval cur = new Interval(-1,-1);

        for(int i=0;i<intervals.size();i++){
            cur = intervals.get(i);

            if(prev.start < cur.start){
                if(prev.end < cur.start){
                    r.add(prev);
                    prev = cur;
                }
                else{
                    prev.end = Math.max(prev.end, cur.end);
                }
            }
            else if(prev.start <= cur.end){
                prev.start = cur.start;
                prev.end = Math.max(prev.end, cur.end);
            }
            else{
                r.add(cur);
            }
        }

        r.add(prev);
        return r;
    }
}
