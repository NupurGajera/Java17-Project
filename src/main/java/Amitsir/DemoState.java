package Amitsir;

import java.util.Scanner;

// wap to calculate 2 no and display output in third variable and print on terminal  (int variable )

import java.util.Scanner;

    public class DemoState {

        public static void main(String[] args) {

            System.out.println("First Execute Program...");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Name : ");
            String name = sc.nextLine();

            System.out.println("Enter the First No : ");
            long a  = sc.nextLong();

            System.out.println("Enter the Second No : ");
            long b = sc.nextLong();

            System.out.println(name);
            System.out.println(a+b);

        }

    }

