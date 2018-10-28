package Backtracking;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 11:13 PM
 */
public class KthPermutation {

    // Generate All permutations and their count

    /*class IntWrapper{
        int value;

        public IntWrapper(int value) {
            this.value = value;
        }
    }

    public boolean permutate(ArrayList<Integer> r, Set<Integer> s, int A, int B, IntWrapper count ){

        if(r.size() == A){
            count.value++;
            return count.value == B;
        }

        for(int i=1;i<=A;i++){
            if(s.contains(i)){
                r.add(i);
                s.remove(i);
                if(permutate(r,s,A,B,count)){
                    return true;
                }
                r.remove(r.size()-1);
                s.add(i);
            }
        }

        return false;
    }

    public String getPermutation(int A, int B) {

        ArrayList<Integer> r = new ArrayList<>();
        Set<Integer> s = new HashSet<>();

        for(int i=1;i<=A;i++){
            s.add(i);
        }

        IntWrapper t = new IntWrapper(0);

        permutate(r,s,A,B,t);

        StringBuilder temp = new StringBuilder();
        for(int i=0;i<r.size();i++){
            temp.append(r.get(i));
        }

        return temp.toString();
    }*/


    public long factorial(int n){

        if(n>15){
            return Integer.MAX_VALUE;
        }

        long fact = 1;

        for(int i=2;i<=n;i++){
            fact *= i;
        }

        return fact;
    }

    public String permutate(ArrayList<Integer> input, int k ){

        int n = input.size();

        //base Condition
        if(n==0){
            return "";
        }
        if(k>factorial(n)){
            return "";
        }

        int f = (int)factorial(n-1);
        int pos = k/f;
        k%=f;

        String ch = String.valueOf(input.get(pos));
        input.remove(pos);
        return ch+permutate(input,k);
    }

    public String getPermutation(int A, int B) {

        ArrayList<Integer> r = new ArrayList<>();

        for(int i=1;i<=A;i++){
            r.add(i);
        }

        return permutate(r,B-1);
    }

    public static void main(String[] args) {
        System.out.println(new KthPermutation().getPermutation(2,2));
    }
}
