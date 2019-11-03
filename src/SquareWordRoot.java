import java.util.Scanner;

public class SquareWordRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word: ");
        String word = scan.next();
        int num = word.length();
        int sqrnum = (int)Math.sqrt(num);
        String squrename = word.substring(sqrnum, sqrnum +1);
        System.out.println("The square root of "+ word +" is "+squrename);
    }
}
