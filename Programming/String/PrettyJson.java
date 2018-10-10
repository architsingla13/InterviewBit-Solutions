package String;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 10/10/18
 * Time - 12:30 PM
 */
public class PrettyJson {

    public ArrayList<String> prettyJSON(String A) {
        
        ArrayList<String> r = new ArrayList<>();

        if(A.length() == 0){
            return r;
        }

        StringBuilder indent = new StringBuilder();
        StringBuilder current = new StringBuilder();

        int i=0;
        while(i<A.length()){
            current.append(A.charAt(i));

            switch(A.charAt(i)){
                case ',':
                    r.add(current.toString());
                    current = new StringBuilder(indent);
                    i++;
                    break;
                case ':':
                    i++;
                    if(i<A.length() && (A.charAt(i) == '{' || A.charAt(i) == '[')){
                        r.add(current.toString());
                        current = new StringBuilder(indent);
                    }
                    break;
                case '{':
                case '[':
                    i++;
                    r.add(current.toString());
                    if(i<A.length() && (A.charAt(i) != '}' || A.charAt(i) != ']')){
                        indent.append('\t');
                    }
                    current = new StringBuilder(indent);
                    break;
                case '}':
                case ']':
                    i++;
                    if(i<A.length()&&A.charAt(i) ==','){
                        break;
                    }
                    r.add(current.toString());
                    if(i<A.length() && (A.charAt(i) != '}' || A.charAt(i) != ']')){
                        if(indent.length()!=0){
                            indent.deleteCharAt(indent.length()-1);
                        }
                    }
                    current = new StringBuilder(indent);
                    break;
                default :
                    i++;
                    if(i<A.length() && (A.charAt(i) == '}' || A.charAt(i) == ']')){
                        r.add(current.toString());
                        if(indent.length()!=0){
                            indent.deleteCharAt(indent.length()-1);
                        }
                        current = new StringBuilder(indent);
                    }
            }

        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new PrettyJson().prettyJSON("{\"id\":100,\"firstName\":\"Jack\",\"lastName\":\"Jones\",\"age\":12}"));
    }
}
