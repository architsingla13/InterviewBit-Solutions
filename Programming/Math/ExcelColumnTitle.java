package Math;

/**
 * Author - archit.s
 * Date - 28/09/18
 * Time - 1:07 PM
 */
public class ExcelColumnTitle {

    public String convertToTitle(int A) {

        StringBuilder s = new StringBuilder();

        while(A > 0){
            int n = A%26;

            if(n == 0){
                s.append("Z");
                A = A/26 - 1;
            }
            else{
                s.append((char)(n-1) + 'A');
                A = A/26;
            }
        }

        return s.reverse().toString();
    }
}
