import java.util.Scanner;

public class Coursess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String courses = "";
        System.out.println("What is the description of the course? ");
        courses = scan.next();
        String department = courses.substring(0, 2);
        String courseNumber = courses.substring(3, 5);
        String title = courses.substring(6, courses.length());
        System.out.println("Department: "+ department);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Title: " + title);


    }
}
