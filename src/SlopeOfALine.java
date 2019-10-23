import java.util.Scanner;

public class SlopeOfALine {
    public static String Slope(int x1, int y1, int x2, int y2){
        double slopec2 =(x2-x1);
        double slopec=(y2-y1)/slopec2;
        String slopename = "";
        if (slopec == 0){
            slopename = "The line defined by the points (" + x1 + " " + y1 + ") and (" + x2 + " " + y2 + ") is a vertical line and the slope is undefined.";
            return slopename;
        }else{
            slopename = "The line defined by the points (" + x1 + " " + y1 + ") and (" + x2 + " " + y2 + ") has a slope of "+slopec;
            return slopename;
        }
    }
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
        System.out.println(Slope(x1, y1, x2, y2));
    }
}
