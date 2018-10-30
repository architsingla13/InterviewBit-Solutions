package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 30/10/18
 * Time - 11:55 PM
 */
public class MaxPointsOnStraightLine {

    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {

        Map<Double, Integer> map = new HashMap<>();

        int maxPoints = 0;

        if(a==null || b==null || a.size() != b.size()){
            return maxPoints;
        }


        for(int i=0;i<a.size();i++){

            int overlapping = 1;
            int vertical = 0;

            for(int j=i+1;j<a.size();j++){

                if(a.get(i).equals(a.get(j))){
                    if(b.get(i).equals(b.get(j))){
                        overlapping++;
                    }
                    else{
                        vertical++;
                    }
                }
                else{
                    double y = b.get(j) - b.get(i);
                    double x = a.get(j) - a.get(i);
                    double slope = 0.0;
                    if(!b.get(j).equals(b.get(i))){
                        slope = 1.0*(y/x);
                    }
                    map.put(slope, map.getOrDefault(slope,0)+1);
                }

            }

            for(Double d : map.keySet()){
                maxPoints = Math.max(maxPoints, map.get(d)+overlapping);
            }

            maxPoints = Math.max(maxPoints, vertical+overlapping);
            map.clear();
        }

        return maxPoints;
    }

    public static void main(String[] args) {
        System.out.println(new MaxPointsOnStraightLine().maxPoints(new ArrayList<>(Arrays.asList(4,8,-4)), new ArrayList<>(Arrays.asList(-4,-4,-4))));
    }
}
