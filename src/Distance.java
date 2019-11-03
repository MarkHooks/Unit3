import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = scan.nextInt();
        System.out.println("Enter x2: ");
        int x2 = scan.nextInt();
        System.out.println("Enter y1: ");
        int y1 = scan.nextInt();
        System.out.println("Enter y2: ");
        int y2 = scan.nextInt();

        int x3 = x1 - x2;

        int y3 = y1 - y2;
        int x3squared =(int) Math.pow(x3, 2);
        int y3squared = (int) Math.pow(y3, 2);
        double c = Math.sqrt(x3squared + y3squared);
        System.out.println("the distance between ("+x1 +","+y1+") and ("+x2+","+y2+") is "+c);


    }
}
