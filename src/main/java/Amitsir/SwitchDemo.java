package Amitsir;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        int value;
        int a,b;
        System.out.println("Calculation Details");
        System.out.println("**********************");
        System.out.println("0 : Addition");
        System.out.println("1 : Sub");
        System.out.println("*********************");
        System.out.println("Enter the value : ");
        Scanner s = new Scanner(System.in);
        value = s.nextInt();

        switch(value)
        {
            case 0:
                System.out.println("Increment ");
                System.out.println("Enter the value of a: ");
                a = s.nextInt();
                System.out.println("Enter the value of b: ");
                b = s.nextInt();
                System.out.println("Total is  : "+(a+b));
                break;
            case 1:
                System.out.println("Option 1 Selected..");
                break;
            case 2:
                System.out.println("Option 2 Selected..");
                break;
            case 3:
                System.out.println("Option 3 Selected..");
                break;
            case 4:
                System.out.println("Option 4 Selected..");
                break;
            default:
                System.out.println("Invalid input..");
                break;
        }
    }
}
