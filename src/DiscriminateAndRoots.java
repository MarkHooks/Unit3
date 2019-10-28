import java.util.Scanner;

public class DiscriminateAndRoots {
    private static String roots(int a, int b, int c){
        String poly = a + "x^2 + " + b +"x +"+c;
        if ((Math.pow(b, 2)-4*a*c)<0)
            return poly + "has two imaginary roots";
        else if((Math.pow(b, 2)-4*a*c)>0)
            return poly + "has 2 real roots";
        else
            return poly + "has 1 real root";

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scan.nextInt();
        System.out.println("Enter B: ");
        int b = scan.nextInt();
        System.out.println("Enter C: ");
        int c = scan.nextInt();
        System.out.println(roots(a,b,c));
    }
}
