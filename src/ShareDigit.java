import java.util.Scanner;

public class ShareDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first two digit number");
        int digit1 = scan.nextInt();
        System.out.println("enter second two digit number");
        int digit2 = scan.nextInt();

        boolean answer;

        int digit1_first = digit1/10;
        int digit1_p2 = digit1%10;

        int digit2_p1 = digit2/10;
        int digit2_p2 = digit2%10;

        if(digit1_first == digit2_p1)
            answer = true;
        else if(digit1_first == digit2_p2)
            answer = true;
        else if(digit1_p2 == digit2_p2)
            answer = true;
        else if(digit1_p2 == digit2_p1)
            answer = true;
        else
            answer = false;
        System.out.println("("+digit1 + ","+ digit2+")"+ answer);
    }
}
