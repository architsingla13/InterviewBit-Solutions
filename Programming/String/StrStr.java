package String;

/**
 * Author - archit.s
 * Date - 06/10/18
 * Time - 1:55 PM
 */
public class StrStr {

    void computeLPS(String pat, int M, int[] lps){
        int i=1;
        int len = 0;
        lps[0] = 0;

        while(i<M){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public int strStr(final String A, final String B) {

        if(A.length() == 0){
            return -1;
        }

        int M = B.length();
        int N = A.length();

        int[] lps = new int[M];
        int i=0,j=0;

        computeLPS(B,M,lps);

        while(i<N){

            if(B.charAt(j) == A.charAt(i)){
                i++;
                j++;
            }
            if(j == M){
                return (i-j);
            }
            else{
                if(i<N && j< M && B.charAt(j) != A.charAt(i)){
                    if(j!=0){
                        j = lps[j-1];
                    }
                    else{
                        i++;
                    }
                }
            }
        }

        return -1;
    }

}
