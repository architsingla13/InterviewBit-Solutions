package Backtracking;

import java.util.*;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 4:31 PM
 */
public class Permutations {

    public void helper(ArrayList<ArrayList<Integer>> r, ArrayList<Integer> A,
                       ArrayList<Boolean> visited, ArrayList<Integer> temp){

        if(temp.size() == A.size()){
            r.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<A.size();i++){
            if(!visited.get(i)){
                temp.add(A.get(i));
                visited.set(i,true);
                helper(r,A,visited,temp);
                temp.remove(temp.size()-1);
                visited.set(i,false);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

        Collections.sort(A);
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Boolean> visited = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            visited.add(false);
        }

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();

        helper(r,A,visited,temp);
        return r;

    }

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(Arrays.asList(1,3,2));
        System.out.println(s);
        s.remove(2);
        System.out.println(s);
        s.add(2);
        System.out.println(s);


    }
}
