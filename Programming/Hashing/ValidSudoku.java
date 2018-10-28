package Hashing;

import java.util.*;

/**
 * Author - archit.s
 * Date - 28/10/18
 * Time - 7:03 PM
 */
public class ValidSudoku {

    public boolean checkRowWise(List<String> A){

        for(int i=0;i<A.size();i++){
            String row = A.get(i);
            Set<Character> s = new HashSet<>();
            for(int j=0;j<row.length();j++){
                Character temp = row.charAt(j);
                if(temp == '.'){
                    continue;
                }
                else if(s.contains(temp)){
                    return true;
                }
                else{
                    s.add(temp);
                }
            }
        }

        return false;
    }


    public boolean checkColWise(List<String> A){

        int colL = A.get(0).length();
        int rowL = A.size();

        for(int i=0;i<colL;i++){
            Set<Character> s = new HashSet<>();
            for(int j=0;j<rowL;j++){
                Character c = A.get(j).charAt(i);
                if(c == '.'){
                    continue;
                }
                if(s.contains(c)){
                    return true;
                }
                else{
                    s.add(c);
                }
            }
        }

        return false;
    }

    public boolean checkBoxWise(List<String> A){

        int colL = A.get(0).length();
        int rowL = A.size();

        int boxCount = (colL/3)*(rowL/3);

        Map<Integer,Set<Character>> map = new HashMap<>();

        for(int i=0;i<boxCount;i++){
            map.put(i,new HashSet<>());
        }

        for(int i=0;i<A.size();i++){
            String row = A.get(i);
            for(int j=0;j<row.length();j++){

                int boxNumber = (j/3)*(colL/3) + (i/3);
                Set<Character> s = map.get(boxNumber);
                Character temp = row.charAt(j);
                if(temp == '.'){
                    continue;
                }
                else if(s.contains(temp)){
                    return true;
                }
                else{
                    s.add(temp);
                    map.put(boxNumber,s);
                }
            }
        }

        return false;
    }

    public int isValidSudoku(final List<String> A) {

        if(checkRowWise(A) || checkColWise(A) || checkBoxWise(A) ){
            return 0;
        }

        return 1;
    }
}
