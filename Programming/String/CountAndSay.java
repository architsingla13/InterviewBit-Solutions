package String;

/**
 * Author - archit.s
 * Date - 05/10/18
 * Time - 12:51 AM
 */
public class CountAndSay {

    public String countAndSay(int A) {

        if(A == 1){
            return "1";
        }

        StringBuilder s = new StringBuilder("11");
        int count  = 0;
        if(A == 2){
            return s.toString();
        }

        while(A != 2){

            StringBuilder temp  = new StringBuilder();
            char value = s.charAt(0);
            count = 1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i) == value){
                    count++;
                }
                else{
                    temp.append(String.valueOf(count));
                    temp.append(value);
                    value = s.charAt(i);
                    count = 1;
                }
            }

            temp.append(String.valueOf(count));
            temp.append(value);

            A--;
            s = temp;
        }

        return  s.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(4));
    }
}
