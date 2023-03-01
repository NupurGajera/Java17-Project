package Homework;

import java.util.Scanner;

public class H5{
    public static void main(String[] args) {
        long a;
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }
    }