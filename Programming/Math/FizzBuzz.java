package Math;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 28/09/18
 * Time - 11:59 AM
 */
public class FizzBuzz {

    public ArrayList<String> fizzBuzz(int A) {

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1;i<=A; i++){
            if(i%3 == 0){
                if(i%5==0){
                    ans.add("FizzBuzz");
                }
                else{
                    ans.add("Fizz");
                }
            }
            else if(i%5 == 0){
                ans.add("Buzz");
            }
            else{
                ans.add(""+i);
            }
        }

        return ans;
    }
}
