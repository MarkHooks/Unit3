import java.util.Scanner;

public class CookieOrders {
    private static double totalcost(int numboxes){
        double costperbox = 0;
        double cost;
        if(numboxes>=1 && numboxes<=4){
            costperbox += 6.95;
            System.out.print("you bought"+numboxes +"boxes of cookies at "+costperbox+" per box. Your total bill is "+ costperbox * numboxes);
        }else if(numboxes>=5 && numboxes<= 9){
            costperbox += 5.95;
            System.out.print("you bought"+numboxes +"boxes of cookies at "+costperbox+" per box. Your total bill is "+ costperbox * numboxes);
        }else if(numboxes>=10 && numboxes<= 15){
            costperbox += 5.50;
            System.out.print("you bought"+numboxes +"boxes of cookies at "+costperbox+" per box. Your total bill is "+ costperbox * numboxes);
        }else if(numboxes>=16){
            costperbox += 4.95;
            System.out.print("you bought"+numboxes +"boxes of cookies at "+costperbox+" per box. Your total bill is "+ costperbox * numboxes);
        }else if(numboxes<0){
            System.out.println("your input is invalid");
        }

        return numboxes;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of boxes you wish to purchase");
        int numboxes = scan.nextInt();
        totalcost(numboxes);

    }

}
