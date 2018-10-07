package String;

/**
 * Author - archit.s
 * Date - 06/10/18
 * Time - 6:24 PM
 */
public class LastWord {

    int jumpReverseSpaces(String A){
        int pos = A.length()-1;
        while(pos>=0 && A.charAt(pos) == ' '){
            pos--;
        }

        return pos;
    }



    public int lengthOfLastWord(final String A) {

        int pos = jumpReverseSpaces(A);

        int count = 0;
        while(pos >= 0 && A.charAt(pos) != ' '){
            count++;
            pos--;
        }

        return count;
    }

}
