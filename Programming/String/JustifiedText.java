package String;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 09/10/18
 * Time - 12:24 PM
 */
public class JustifiedText {

    public ArrayList<String> fullJustify(ArrayList<String> A, int B) {

        ArrayList<String> r = new ArrayList<>();

        if(A == null || A.size() == 0){
            return A;
        }

        int last = 0;
        int count = 0;

        for(int i=0;i<A.size();i++){

            count+= A.get(i).length();

            if(count+i-last > B){
                int eachLen = 1;
                int extraLen = 0;

                int wordLen = count - A.get(i).length();
                int spaceLen = B - wordLen;

                if(i-last-1 > 0){
                    eachLen = spaceLen/(i-last-1);
                    extraLen = spaceLen%(i-last-1);
                }

                StringBuilder sb = new StringBuilder();

                for(int j=last;j<i-1;j++){
                    sb.append(A.get(j));

                    int temp = 0;
                    while(temp<eachLen){
                        sb.append(" ");
                        temp++;
                    }

                    while(extraLen > 0){
                        sb.append(" ");
                        extraLen--;
                    }
                }

                sb.append(A.get(i-1));

                while(sb.length() < B){
                    sb.append(" ");
                }

                r.add(sb.toString());

                last = i;
                count = A.get(i).length();
            }
        }


        StringBuilder sb = new StringBuilder();
        for(int i=last;i<A.size()-1;i++){
            sb.append(A.get(i));
            sb.append(" ");
        }

        sb.append(A.get(A.size()-1));

        while(sb.length() < B){
            sb.append(" ");
        }

        if(sb.length()>0){
            r.add(sb.toString());
        }

        return r;
    }
}
