package Amitsir;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {

        // Scanner is class
        // sc is an object
        // new is a keyword
        // System.in it means going to get value from user
        Scanner sc = new Scanner(System.in);
        // sc is an object
        System.out.println("Enter the Name : ");
        String cname = sc.nextLine();           // next line is a method
        System.out.println("Name is : " +cname);

        System.out.println("Enter the Age : ");
        int cage = sc.nextInt();
        System.out.println("Age is : " +cage);

        System.out.println("Enter the sal : ");
        double csal = sc.nextDouble();
        System.out.println("Salary is : " +csal);
    }
}
