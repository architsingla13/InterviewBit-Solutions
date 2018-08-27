package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 12:53 PM
 */
public class TripletsSum {

    public int solve(ArrayList<String> A) {

        if(A.size()<3){
            return 0;
        }

        double a = Double.valueOf(A.get(0));
        double b = Double.valueOf(A.get(1));
        double c = Double.valueOf(A.get(2));

        for(int i=3;i<A.size();i++){
            if(a+b+c>1 && a+b+c<2){
                return 1;
            }

            double t = Double.valueOf(A.get(i));

            if(a+b+c >=2){
                if(a>b && a > c){
                    a = t;
                }
                else if(b > c && b > a){
                    b = t;
                }
                else{
                    c = t;
                }
            }
            else{
                if(a<b && a < c){
                    a = t;
                }
                else if(b < c && b < a){
                    b = t;
                }
                else{
                    c = t;
                }
            }
        }

        if(a+b+c>1 && a+b+c<2){
            return 1;
        }
        else{
            return 0;
        }
    }

}
