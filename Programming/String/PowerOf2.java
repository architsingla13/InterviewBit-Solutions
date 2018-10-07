package String;

/**
 * Author - archit.s
 * Date - 07/10/18
 * Time - 9:29 PM
 */
public class PowerOf2 {

    String multiply(String temp){

        StringBuilder s = new StringBuilder();
        int carry = 0;
        for(int i=temp.length()-1;i>=0;i--){
            int num = temp.charAt(i) - '0' ;
            num = 2*num + carry;
            carry = num/10;
            num = num%10;
            char t = (char)(num +'0');
            s.insert(0,t);
        }
        if(carry > 0){
            s.insert(0,(char)(carry +'0'));
        }
        return s.toString();
    }

    int compare(String t, String v){
        if(t.length() == v.length()){
            return t.compareTo(v) < 0 ? 1 : 0;
        }
        else if(t.length() < v.length()){
            return 1;
        }
        return 0;
    }

    public int power(String A) {

        int pos = 0;
        int l =A.length();
        while(pos<l && A.charAt(pos) == '0'){
            pos++;
        }

        if(pos == l){
            return 0;
        }

        A = A.substring(pos,l);

        String temp = "2";

        while(compare(temp, A) == 1){
            temp = multiply(temp);
        }

        if(temp.equals(A)){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new PowerOf2().power("64"));
    }
}
