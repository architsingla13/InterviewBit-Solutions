package Backtracking;

/**
 * Author - archit.s
 * Date - 26/10/18
 * Time - 11:38 AM
 */
public class ModularExpression {

    private int Mod(int A, int B, int C) {

        long result = 1;
        long input = A;

        while(B > 0){

            if((B & 1) == 1){
                result = (result*input)%C;
            }

            input = (input*input)%C;
            B >>= 1;
        }

        while(result < 0){
            result = (result+C)%C;
        }

        return (int)result%C;
    }

    public static void main(String[] args) {
        System.out.println(new ModularExpression().Mod(-1,1,20));
    }
}
