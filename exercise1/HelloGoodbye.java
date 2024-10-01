import java.util.Scanner;

public class HelloGoodbye {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first name:");
        String firstName = in.nextLine();
        System.out.println("Please enter the second name:");
        String secondName = in.nextLine();


        System.out.println("Hello " + firstName + " and " + secondName + ".");
        System.out.println("Goodbye " + secondName + " and " + firstName + ".");


    }
}