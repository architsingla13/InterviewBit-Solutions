package HashMaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 12:11 PM
 */
public class MaxHeaps {

    long MOD = 1000000007l;
    Map<Integer, Long> numberOfHeaps = new HashMap<>();

    long[][] nck = new long[101][101];
    int[] pow2 = new int[11];

    public int solve(int A) {

        for(int i=0;i<101;i++){
            nck[i][0] = 1l;
            nck[i][i] = 1l;
        }

        for(int i=2;i<101;i++){
            for(int j=1;j<i;j++){
                nck[i][j] = (nck[i-1][j-1] + nck[i-1][j])%MOD;
            }
        }

        pow2[0] = 1;
        for(int i=1;i<11;i++){
            pow2[i] = 2*pow2[i-1];
        }

        numberOfHeaps.put(0,1l);
        numberOfHeaps.put(1,1l);
        numberOfHeaps.put(2,1l);
        numberOfHeaps.put(3,2l);
        numberOfHeaps.put(4,3l);

        return (int)(solveHeaps(A));
    }

    int findHeight(int n){

        int h = 0;
        while(n>0){
            n/=2;
            h++;
        }

        return h;
    }

    int leftTreeElements(int n){

        int h = findHeight(n);
        //Second last level elements plus rest elements in last level, max upto half filled as its left tree
        int r = (pow2[h-2]-1) + Math.min((n-(pow2[h-1]-1)), pow2[h-2] );

        return r;

    }

    public long solveHeaps(int n){

        if(numberOfHeaps.containsKey(n)){
            return (numberOfHeaps.get(n));
        }

        int leftTreeElements =  leftTreeElements(n);

        long solution = (nck[n-1][leftTreeElements]%MOD);
        solution = (solution*solveHeaps(leftTreeElements)%MOD);

        solution = (solution * solveHeaps(n-1-leftTreeElements))%MOD;

        numberOfHeaps.put(n,solution);

        return solution;
    }

    public static void main(String[] args) {
        System.out.println(new MaxHeaps().solve(4));
    }
}
