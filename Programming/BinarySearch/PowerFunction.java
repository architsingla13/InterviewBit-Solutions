package BinarySearch;

/**
 * Author - archit.s
 * Date - 03/10/18
 * Time - 11:48 AM
 */
public class PowerFunction {

    public int pow(int x, int n, int d) {

        long res = 1;

        if(x == 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }

        boolean flag = false;
        if(x < 0){
            x = Math.abs(x);
            if(n%2 == 1){
                flag = true;
            }
        }

        long temp = x%d;

        while(n > 0){
            if((n&1) == 1){
                res = (res*temp)%d;
            }

            temp = (temp*temp)%d;

            n = n>>1;
            if(res > d){
                res = res%d;
            }
        }

        if(flag){
            return d - (int)res;
        }

        return (int)res;
    }

}
