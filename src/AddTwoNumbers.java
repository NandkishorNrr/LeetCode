import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        List l1 = new LinkedList<Integer>();
        List l2 = new LinkedList<Integer>();

        /*l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);
*/
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);

        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        var add = addTwoNumbers(l1, l2);
        System.out.println(add);
    }
    public static List addTwoNumbers(List l1, List l2) {
        int num1 = 0;
        int num2 = 0;
        int sum;
        List sumList = new LinkedList<Integer>();

        for (int i = l1.size() - 1; i >= 0; i--) {
            num1 = (num1 * 10) + (int)(l1.get(i));
        }

        for (int i = l2.size() - 1; i >= 0 ; i--) {
            num2 = num2*10 + (int)(l2.get(i));
        }

        sum = num1 + num2;

       while (sum != 0) {
           sumList.add(sum % 10);
           sum = sum / 10;
       }
        return sumList;
    }
}
