package Array;

import java.util.*;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 1:44 PM
 */
public class HotelBookings {

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int roomsRequired=1,i=1,j=0;
        int max= 1;
        while(i<arrive.size()  && j<arrive.size() ){
            if(arrive.get(i)<depart.get(j) ){
                i++;
                roomsRequired++;
                if(roomsRequired > max){
                    max = roomsRequired;
                }
            }else{
                j++;
                roomsRequired--;
            }
        }
        return max <= K;
    }

}
