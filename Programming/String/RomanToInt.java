package String;

/**
 * Author - archit.s
 * Date - 07/10/18
 * Time - 2:45 PM
 */
public class RomanToInt {

    boolean isLess(String A, int left, int right){

        return value(A, left) < value(A, right);

    }

    int value(String A, int pos){
        switch(A.charAt(pos)){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            default:
                return 1;
        }
    }

    private int romanToInt(String A) {

        int result = 0;

        for(int i=A.length()-1;i>=0;){
            if(i-1>=0 && isLess(A,i-1,i)){
                result+= (value(A,i)-value(A,i-1));
                i-=2;
            }
            else{
                result+= value(A,i);
                i--;
            }
            if(i<0){
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        StringBuilder s=new StringBuilder(),f = new StringBuilder();
        s.append(f);
        System.out.println(new RomanToInt().romanToInt("MMDCCXLIII"));
    }
}
