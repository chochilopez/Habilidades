import edu.princeton.cs.algs4.StdIn;

import java.util.Scanner;


public class HelloGoodbye {
    public static void main (String[] args){
        System.out.println("Please enter the first name:");
        String firstName = StdIn.readString();
        System.out.println("Please enter the second name:");
        String secondName = StdIn.readString();


        System.out.println("Hello " + firstName + " and " + secondName + ".");
        System.out.println("Goodbye " + secondName + " and " + firstName + ".");


    }
}