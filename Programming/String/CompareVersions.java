package String;

/**
 * Author - archit.s
 * Date - 06/10/18
 * Time - 2:14 PM
 */
public class CompareVersions {

    public int compareVersion(String A, String B) {

        int i=0;
        int j=0;

        int l1=A.length(),l2=B.length();
        while(i < l1 && j < l2){
            while(i<l1 && A.charAt(i) =='0'){
                i++;
            }

            StringBuilder s1 = new StringBuilder();
            while(i<l1 && A.charAt(i)!='.'){
                s1.append(A.charAt(i));
                i++;
            }

            while(j<l2 && B.charAt(j)=='0'){
                j++;
            }

            StringBuilder s2 = new StringBuilder();
            while(j<l2 && B.charAt(j)!='.'){
                s2.append(B.charAt(j));
                j++;
            }

            String t1 = s1.toString();
            String t2 = s2.toString();

            if(!t1.equals(t2)){
                if(t1.length() == t2.length()){
                    return t1.compareTo(t2) > 0 ? 1:-1;
                }
                return t1.length() > t2.length() ? 1:-1;
            }
            i++;
            j++;
        }

        while(i<l1 && A.charAt(i) =='0'){
            i++;
        }

        while(j<l2 && B.charAt(j)=='0'){
            j++;
        }

        if(i>=l1 && j>=l2){
            return 0;
        }
        return i>j ? 1:-1;
    }

    public static void main(String[] args) {
        System.out.println(new CompareVersions().compareVersion("01", "1"));
        System.out.println(2147483647);
    }

}
