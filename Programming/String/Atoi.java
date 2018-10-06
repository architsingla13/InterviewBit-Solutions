package String;

/**
 * Author - archit.s
 * Date - 06/10/18
 * Time - 6:07 PM
 */
public class Atoi {

    int jumpSpaces(String A, int pos){

        while(pos<A.length() && A.charAt(pos) == ' '){
            pos++;
        }

        return pos;
    }

    boolean isDigit(String A, int pos){
        if(A.charAt(pos) >= '0' && A.charAt(pos) <='9'){
            return true;
        }
        return false;
    }

    public int atoi(final String A) {

        int pos = 0;

        pos = jumpSpaces(A,pos);
        boolean neg;

        if(isDigit(A,pos) || A.charAt(pos) =='+'){
            neg = false;
            if(A.charAt(pos)=='+'){
                pos++;
            }
        }
        else if(A.charAt(pos) == '-'){
            neg = true;
            pos++;
        }
        else{
            return 0;
        }

        if(!isDigit(A,pos)){
            return 0;
        }

        int res = 0;

        while(pos < A.length() && isDigit(A,pos)){

            int temp = 10*res + A.charAt(pos) - '0';
            if( (temp - (A.charAt(pos) - '0'))/10 != res){
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = temp;
            pos++;
        }

        return neg ? -1*res : res;
    }

    public static void main(String[] args) {
        System.out.println(new Atoi().atoi("5121478262"));
    }

}
