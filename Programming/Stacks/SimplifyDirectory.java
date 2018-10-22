package Stacks;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 22/10/18
 * Time - 11:30 PM
 */
public class SimplifyDirectory {

    public String simplifyPath(String A) {

        Stack<String> s = new Stack<>();

        for(int i=0;i<A.length();){
            StringBuilder temp = new StringBuilder();
            if(A.charAt(i) == '/'){
                i++;
                continue;
            }
            else if(A.charAt(i) =='.'){
                if(i+1<A.length()){
                    if(A.charAt(i+1) == '.' && !s.empty()){
                        s.pop();
                        i++;
                    }
                }
                i++;
            }
            else{
                while(i<A.length() && A.charAt(i) !='/'){
                    temp.append(A.charAt(i));
                    i++;
                }
                s.push(temp.toString());
            }
        }

        StringBuilder ans = new StringBuilder();
        while(!s.empty()){
            ans.insert(0, "/" + s.peek());
            s.pop();
        }

        if(ans.toString().equals("")){
            return "/";
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SimplifyDirectory().simplifyPath("/home//foo/"));
    }
}
