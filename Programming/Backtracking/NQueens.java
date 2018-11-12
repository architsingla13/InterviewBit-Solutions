package Backtracking;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 11/11/18
 * Time - 1:31 PM
 */
public class NQueens {

    boolean isSafe(ArrayList<String> input, int row, int col, int N){

        for(int i=0;i<N;i++){
            String s = input.get(row);
            if(s.charAt(i) == 'Q'){
                return false;
            }
        }

        for(int i=0;i<N;i++){
            String s = input.get(i);
            if(s.charAt(col) == 'Q'){
                return false;
            }
        }

        int i, j;

        for(i=row,j=col;i>=0 && j>=0;i--,j--){
            String s = input.get(i);
            if(s.charAt(j) == 'Q'){
                return false;
            }
        }

        for(i=row, j=col;i>=0 && j<N;i--,j++){
            String s = input.get(i);
            if(s.charAt(j) == 'Q'){
                return false;
            }
        }

        return true;
    }

    boolean helper(ArrayList<ArrayList<String>> r, ArrayList<String> input, int row, int N){

        if(row>=N){
            r.add(new ArrayList<>(input));
            return true;
        }

        boolean res = false;
        for(int i=0;i<N;i++){

            if(isSafe(input, row, i, N)){

                StringBuilder s = new StringBuilder(input.get(row));
                s.setCharAt(i,'Q');
                input.set(row,s.toString());

                res = helper(r,input,row+1,N) || res;

                s = new StringBuilder(input.get(row));
                s.setCharAt(i,'.');
                input.set(row,s.toString());
            }
        }

        return res;
    }

    public ArrayList<ArrayList<String>> solveNQueens(int a) {

        ArrayList<ArrayList<String>> r = new ArrayList<>();

        ArrayList<String> input = new ArrayList<>();
        for(int i=0;i<a;i++){
            StringBuilder s = new StringBuilder();
            for(int j=0;j<a;j++){
                s.append(".");
            }
            input.add(s.toString());
        }


        helper(r,input,0,a);

        return r;
    }
}
