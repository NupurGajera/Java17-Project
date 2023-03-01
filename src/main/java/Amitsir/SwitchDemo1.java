package Amitsir;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {

        String s;
        System.out.println("Enter the Character : ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        switch (s)
        {
            case "A":
                System.out.println("Option 'A' : Amit");
                break;
            case "H":
                System.out.println("Option 'H' : Hardik");
                break;
            case "D":
                System.out.println("Option 'D' : Dhruv");
                break;
            case "J":
                System.out.println("Option 'J' : Jigar");
                break;
            default:
                System.out.println("invalid input..");
                break;
        }

    }
}
