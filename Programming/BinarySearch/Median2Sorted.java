package BinarySearch;

import java.util.List;

/**
 * Author - archit.s
 * Date - 04/10/18
 * Time - 12:40 PM
 */
public class Median2Sorted {
    int findKth(int k, List<Integer> a, List<Integer> b, int s1, int s2){

        if(s1 >= a.size()){
            return b.get(s2+k-1);
        }
        else if(s2 >= b.size()){
            return a.get(s1+k-1);
        }

        if(k==1){
            return Math.min(a.get(s1), b.get(s2));
        }

        int m1 = s1 + k/2 -1;
        int m2 = s2 + k/2 -1;

        int mid1 = m1 < a.size() ? a.get(m1) : Integer.MAX_VALUE;
        int mid2 = m2 < b.size() ? b.get(m2) : Integer.MAX_VALUE;

        if(mid1 < mid2){
            return findKth(k-k/2, a,b,m1+1,s2);
        }
        else{
            return findKth(k-k/2, a,b,s1,m2+1);
        }
    }


    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        int total = a.size() + b.size();

        if(total%2 ==0){
            return (findKth(total/2+1,a,b,0,0) + findKth(total/2,a,b,0,0))/2.0;
        }
        else{
            return findKth(total/2+1,a,b,0,0);
        }
    }
}
