package Backtracking;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 26/10/18
 * Time - 12:29 PM
 */
public class Combinations {

    public void addCombinations(ArrayList<ArrayList<Integer>> r, int pos, int N, int K, ArrayList<Integer> temp){

        if(temp.size() == K){
            r.add(new ArrayList<>(temp));
        }
        else if(temp.size() > K){
            return;
        }

        for(int i=pos;i<=N;i++){
            temp.add(i);
            addCombinations(r,i+1,N,K,temp);
            temp.remove(temp.size()-1);
        }
    }

    public ArrayList<ArrayList<Integer>> combine(int A, int B) {

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        addCombinations(r,1,A,B,temp);

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new Combinations().combine(2,1));
    }
}
