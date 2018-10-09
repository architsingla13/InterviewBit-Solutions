package String;

/**
 * Author - archit.s
 * Date - 09/10/18
 * Time - 12:40 PM
 */
public class ZigZag {

    private String convert(String A, int B) {

        if(A.length() == 1 || B == 1){
            return A;
        }

        StringBuilder s = new StringBuilder();
        int i =0;
        while(s.length()<A.length()){
            int j = i;
            boolean flip = false;
            while(j<A.length() && s.length()<A.length()){
                s.append(A.charAt(j) );
                if(!flip){
                    if(i == B - 1){
                        i = 0;
                    }
                    j = j + 2*(B-i-1);
                }
                else{
                    j = j + 2*(i);
                }
                flip = (i == 0 || i == B-1) ? false : !flip;
            }
            i++;
        }

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ZigZag().convert("PAYPALISHIRING", 5));
    }
}
