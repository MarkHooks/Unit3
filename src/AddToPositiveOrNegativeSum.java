import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int posnum= 0;
        int negnum= 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("enter your number: ");
            int num =scan.nextInt();
            if(num>0)
                posnum += num;
            if(num< 0)
                negnum += num;
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
        }
        System.out.println("the sum of the positive numbers is:" + posnum);
        System.out.println("the sum of the negative numbers is:" + negnum);
        //output the sums    }
    }
}
