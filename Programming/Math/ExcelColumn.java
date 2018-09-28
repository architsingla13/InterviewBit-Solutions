package Math;

/**
 * Author - archit.s
 * Date - 28/09/18
 * Time - 12:52 PM
 */
public class ExcelColumn {

    public int titleToNumber(String A) {

        int ans = 0;

        for(int i=0;i<A.length();i++){
            ans  = 26*ans;
            ans += A.charAt(i) - 'A' + 1;
        }

        return ans;
    }
}
