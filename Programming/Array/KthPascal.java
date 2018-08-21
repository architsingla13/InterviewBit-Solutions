package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 21/08/18
 * Time - 11:30 PM
 */
public class KthPascal {

    public ArrayList<Integer> getRow(int A) {

        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();

        row1.add(1);
        row2.add(1);
        row2.add(1);

        if(A == 0){
            return row1;
        }
        else if(A == 1){
            return row2;
        }
        else{

            int count = 2;

            while(count <= A){
                if(count%2 == 0){
                    int newCount = row2.size() + 1;
                    for(int i = row1.size(); i< newCount; i++ ){
                        row1.add(1);
                    }

                    int temp = row1.size()-1;
                    for(int j=1; j< temp; j++){
                        row1.set(j, row2.get(j) + row2.get(j-1));
                    }
                }
                else{
                    int newCount = 1 + row1.size();
                    for(int i = row2.size(); i<newCount; i++ ){
                        row2.add(1);
                    }

                    int temp = row2.size()-1;
                    for(int j=1; j< temp; j++){
                        row2.set(j, row1.get(j) + row1.get(j-1));
                    }
                }

                count++;
            }

            if(count%2 == 1){
                return row1;
            }
            return row2;
        }
    }
}
