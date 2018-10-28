package Hashing;

import java.util.*;

/**
 * Author - archit.s
 * Date - 28/10/18
 * Time - 3:23 PM
 */
public class FourSum {

    class Pair{
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {

        Collections.sort(A);
        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        Map<ArrayList<Integer>, Boolean> result = new HashMap<>();

        Map<Integer,List<Pair>> map = new HashMap<>();

        for(int i=0;i<A.size()-1;i++){
            for(int j=i+1;j<A.size();j++){
                int tempSum = A.get(i) + A.get(j);

                if(map.containsKey(tempSum)){
                    List<Pair> t = map.get(tempSum);

                    for (Pair p : t) {
                        if (p.key != i && p.value != i && p.key != j && p.value != j) {

                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(A.get(p.key));
                            temp.add(A.get(p.value));
                            temp.add(A.get(i));
                            temp.add(A.get(j));
                            Collections.sort(temp);
                            result.put(temp, true);
                        }
                    }
                }

                List<Pair> t;
                if(map.containsKey(B-tempSum)){
                    t = map.get(B-tempSum);
                }
                else{
                    t = new ArrayList<>();
                }
                Pair p = new Pair(i,j);
                t.add(p);
                map.put(B-tempSum, t);
            }
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(result.keySet());

        list.sort((a1, a2) -> {
            int v = 0;
            for (int i = 0; i < 4; i++) {
                v += (a1.get(i)-a2.get(i));
                if(v!=0){
                    return v;
                }
            }
            return v;
        });

        return list;
    }

    public static void main(String[] args) {
        System.out.println(new FourSum().fourSum(new ArrayList<>(Arrays.asList(1,0,-1,0,-2,2)),0));
    }
}
