import java.util.Scanner;

public class NumaricComparrison {
    public static boolean isOdd(int num) {

        return num % 2 != 0;
    }

    public static boolean isZero(int num) {
        return num % 2 == 0;
    }
    public static boolean isPositive(int num){
        return num>0;
    }
    public static boolean isNegative(int num){
        return num<0;
    }
    public static boolean isFactor(int num, int num2){
        return num2%num == 0;
    }
    public static boolean isMultiple(int num, int num2){
        return num2%num == 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1 + "is odd:" + isOdd(num1));
        System.out.println(num1 + "is zero:" + isZero(num1));
        System.out.println(num1 + "is positive:" + isPositive(num1));
        System.out.println(num1 + "is negative:" + isNegative(num1));
        System.out.println(num1 + "is factor:" + isFactor(num1, num2));
        System.out.println(num1 + "is multiple:" + isMultiple(num1, num2));

    }

}
