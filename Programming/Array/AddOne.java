package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 18/08/18
 * Time - 3:16 PM
 */
public class AddOne {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();

        int carry = (A.get(n-1)+1)/10;
        A.set(n-1, (A.get(n-1) + 1)%10);
        for (int i = n-2; i >= 0; i--) {
            int temp = (A.get(i) + carry)/10;
            A.set(i, (A.get(i) + carry)%10);
            carry = temp;
            if (carry == 0){
                break;
            }
        }

        if (carry == 1){
            A.add(0, carry);
            return A;
        }
        else{
            int start = 0;
            for (Integer aA : A) {
                if (aA == 0) {
                    start++;
                } else {
                    break;
                }
            }
            return new ArrayList<>(A.subList(start, A.size()));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<>();
        t.add(9);
        t.add(9);
        t.add(9);
        t.add(9);
        System.out.println(new AddOne().plusOne(t));
    }
}
