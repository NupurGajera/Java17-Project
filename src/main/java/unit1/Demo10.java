package unit1;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        String name;
        long age, salary;
        System.out.println("enter the name :");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        System.out.println("enter the age :");
        age = s.nextLong();
        System.out.println("enter the salary :");
        salary = s.nextLong();

        System.out.println("name is :" + name);

        System.out.println("age is :" + age);

        System.out.println("salary is :" + salary);

    }
}