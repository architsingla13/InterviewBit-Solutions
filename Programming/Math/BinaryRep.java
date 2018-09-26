package Math;

/**
 * Author - archit.s
 * Date - 26/09/18
 * Time - 12:02 PM
 */
public class BinaryRep {

    public String findDigitsInBinary(int A) {

        StringBuilder s = new StringBuilder();
        if(A == 0){
            return "0";
        }

        while(A > 0){
            s.append(A%2);
            A /= 2;
        }

        return s.reverse().toString();
    }
}
