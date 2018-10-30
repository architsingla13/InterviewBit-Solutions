package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 30/10/18
 * Time - 12:04 PM
 */
public class Equal {

    class Pair{
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public ArrayList<Integer> equal(ArrayList<Integer> A) {

        ArrayList<Integer> r = new ArrayList<>();
        Map<Integer,Pair> map = new HashMap<>();

        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){

                int sum = A.get(i) + A.get(j);

                if(map.containsKey(sum)){

                    Pair p = map.get(sum);
                    if(p.key != i && p.value!= i && p.value!= j && p.key != j){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(p.key);
                        temp.add(p.value);
                        temp.add(i);
                        temp.add(j);
                        if(r.size()==0){
                            r = temp;
                        }
                        else{
                            for(int k=0;k<4;k++){
                                if(r.get(k) < temp.get(k)){
                                    break;
                                }
                                else if(r.get(k) > temp.get(k)){
                                    r = temp;
                                }
                            }
                        }
                    }

                }
                else{
                    Pair p = new Pair(i,j);
                    map.put(sum,p);
                }

            }
        }

        return r;
    }
}
