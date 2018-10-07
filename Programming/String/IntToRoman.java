package String;

/**
 * Author - archit.s
 * Date - 07/10/18
 * Time - 3:23 PM
 */
public class IntToRoman {

    StringBuilder value(int n, int param){
        StringBuilder s = new StringBuilder();
        switch(param){
            case 1000:
                for(int i=1;i<=n;i++){
                    s.append("M");
                }
                return s;
            case 100:
                if(n==4){
                    s.append("CD");
                }
                else if(n==5){
                    s.append("D");
                }
                else if(n==9){
                    s.append("CM");
                }
                else{
                    if(n<5){
                        for(int i=1;i<=n;i++){
                            s.append("C");
                        }
                    }
                    else{
                        s.append("D");
                        n -= 5;
                        for(int i=1;i<=n;i++){
                            s.append("C");
                        }
                    }
                }
                return s;
            case 10:
                if(n==4){
                    s.append("XL");
                }
                else if(n==5){
                    s.append("L");
                }
                else if(n==9){
                    s.append("XC");
                }
                else{
                    if(n<5){
                        for(int i=1;i<=n;i++){
                            s.append("X");
                        }
                    }
                    else{
                        s.append("L");
                        n -= 5;
                        for(int i=1;i<=n;i++){
                            s.append("X");
                        }
                    }
                }
                return s;
            default:
                if(n==4){
                    s.append("IV");
                }
                else if(n==5){
                    s.append("V");
                }
                else if(n==9){
                    s.append("IX");
                }
                else{
                    if(n<5){
                        for(int i=1;i<=n;i++){
                            s.append("I");
                        }
                    }
                    else{
                        s.append("V");
                        n -= 5;
                        for(int i=1;i<=n;i++){
                            s.append("I");
                        }
                    }
                }
                return s;
        }
    }

    public String intToRoman(int A) {

        StringBuilder s = new StringBuilder();

        int n = 1000;
        while(A>0 && n>0){
            if(A/n > 0){
                s.append(value(A/n, n));
            }
            A %= n;
            n /= 10;

        }

        return s.toString();
    }

}
