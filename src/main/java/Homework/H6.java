package Homework;

import java.util.Scanner;

public class H6{
    public static void main(String[] args) {

        String name;
        System.out.println("Enter the name");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();

        StringBuilder var = new StringBuilder();
        var.append(name);
        var.reverse();
        System.out.println("The reverse string name is :");
        System.out.println(var);
    }
}
