package String;

/**
 * Author - archit.s
 * Date - 07/10/18
 * Time - 12:37 PM
 */
public class ValidNumber {

    boolean isDigit(String A, int pos){
        if(A.charAt(pos) >= '0' && A.charAt(pos) <= '9'){
            return true;
        }
        return false;
    }

    public int isNumber(final String A) {


        //skip leading spaces
        int pos = 0;
        int l = A.length();
        while(pos<l && A.charAt(pos) == ' '){
            pos++;
        }

        int flag = 0;
        boolean exp = false, decimal = false;

        boolean space = false;

        int sign = 0;

        while(pos < l ){
            if(isDigit(A,pos)){
                pos++;
                flag = 1;
                if(space){
                    return 0;
                }
            }
            else if(A.charAt(pos) =='e' && !exp && flag == 1){
                exp = true;
                pos++;
                if(space){
                    return 0;
                }
            }
            else if(A.charAt(pos) == '.' && !decimal && !exp){
                decimal = true;
                flag = 0;
                pos++;
                if(space){
                    return 0;
                }
            }
            else if((A.charAt(pos) == '+' || A.charAt(pos) == '-') && flag == 0 && !exp && !decimal && sign == 0){
                pos++;
                sign++;
                if(space){
                    return 0;
                }
            }
            else if((A.charAt(pos) == '+' || A.charAt(pos) == '-') && flag == 1 && exp && sign<=1){
                pos++;
                sign++;
                if(space){
                    return 0;
                }
            }
            else if(A.charAt(pos) == ' '){
                space = true;
                pos++;
            }
            else{
                return 0;
            }
        }

        return flag;
    }

}
