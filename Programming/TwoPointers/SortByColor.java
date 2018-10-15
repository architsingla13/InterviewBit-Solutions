package TwoPointers;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 15/10/18
 * Time - 11:09 PM
 */
public class SortByColor {
    public void sortColors(ArrayList<Integer> a) {

        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<a.size();i++){
            if(a.get(i).equals(0)){
                count0++;
            }
            else if(a.get(i).equals(1)){
                count1++;
            }
            else{
                count2++;
            }
        }

        int i=0;
        while(i < count0){
            a.set(i,0);
            i++;
        }
        i=0;
        while(i < count1){
            a.set(i+count0,1);
            i++;
        }
        i=0;
        while(i < count2){
            a.set(i+count0+count1,2);
            i++;
        }
    }
}
