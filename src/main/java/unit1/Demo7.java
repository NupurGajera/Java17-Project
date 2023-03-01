package unit1;

import java.util.Scanner;

//scanner demo
//wap get the 2 long value from user and sum it
public class Demo7 {
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter the value of a :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Enter the value of B :");
        b = s.nextInt();
        System.out.println("total is :"+(a+b));
    }
}
