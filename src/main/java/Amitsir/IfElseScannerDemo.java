package Amitsir;

import java.util.Scanner;

public class IfElseScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First No : ");
        int a  = sc.nextInt();

        System.out.println("Enter the Second no : ");
        int b = sc.nextInt();

        if(a<b) {
            System.out.println("A is small : " + a);
            System.out.println("Amit");
        }
        else {
            System.out.println("B is small : " + b);
            System.out.println("Jigar");
        }
    }
}
