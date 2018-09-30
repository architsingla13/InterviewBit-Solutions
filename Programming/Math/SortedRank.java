package Math;

/**
 * Author - archit.s
 * Date - 30/09/18
 * Time - 1:00 AM
 */
public class SortedRank {

    int fact(int A){
        if(A <= 1){
            return A;
        }

        return A*fact(A-1)%1000003;
    }

    int smallerRight(String A, int low, int high){

        char c = A.charAt(low);
        int count = 0;
        for(int i=low+1;i<=high;i++){
            if(c > A.charAt(i)){
                count++;
            }
        }

        return count;
    }

    public int findRank(String A) {

        int rank = 1;

        int countRight = 0;

        for(int i=0;i<A.length();i++){

            countRight = smallerRight(A, i, A.length()-1);
            rank += (countRight*fact(A.length()-i-1));
            rank = rank % 1000003;
        }

        return rank;
    }

}
