package String;

/**
 * Author - archit.s
 * Date - 07/10/18
 * Time - 7:53 PM
 */
public class AddBinary {

    public String addBinary(String A, String B) {

        int carry = 0;
        if(A.length()<B.length()){
            String temp = A;
            A = B;
            B = temp;
        }

        int m = A.length()-1;
        int n = B.length()-1;

        StringBuilder s = new StringBuilder();
        int count;
        while(n>=0 || m>=0){
            count = carry;
            if(n>=0){
                count += B.charAt(n) - '0';
                n--;
            }
            if(m>=0){
                count += A.charAt(m) - '0';
                m--;
            }

            carry = count/2;
            count = count & 1;
            if(count == 1){
                s.insert(0,"1");
            }
            else{
                s.insert(0,"0");
            }
        }
        if(carry == 1){
            s.insert(0,"1");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("1110000000010110111010100100111", "101001"));
    }
}
