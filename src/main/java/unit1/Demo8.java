package unit1;

import java.util.Scanner;
public class Demo8 {

        public static void main(String[] args) {

           int value;
            int a,b;
            System.out.println("Calculation Details");
            System.out.println("****************************");
            System.out.println("0 : Addition");
            System.out.println("1 : Sub");
            System.out.println("2 : multiplication");
            System.out.println("3 : Divided");
            System.out.println("4 : percentage");
            System.out.println("**************************");
            System.out.println("choose your number....");
            Scanner s = new Scanner(System.in);
            value = s.nextInt();

            switch(value)
            {
                case 0:
                    System.out.println("Option 0 Selected..");

                    System.out.println("you select Addition");
                    System.out.println("Enter the value of a : ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Total is  : "+(a+b));
                    break;

                case 1:
                    System.out.println("Option 1 Selected..");
                    System.out.println("you select sub");
                    System.out.println("Enter the value of a : ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Total is  : "+(a-b));
                    break;

                case 2:
                    System.out.println("Option 2 Selected..");
                    System.out.println("you select Multiplication");
                    System.out.println("Enter the value of a : ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Total is  : "+(a*b));
                    break;

                case 3:
                    System.out.println("Option 3 Selected..");
                    System.out.println("you select divided");
                    System.out.println("Enter the value of a : ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Total is  : "+(a/b));
                    break;
                case 4:
                    System.out.println("Option 4 Selected..");
                    System.out.println("you select percentage");
                    System.out.println("Enter the value of a : ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Total is  : "+(a%b));
                    break;
                default:
                    System.out.println("Invalid input..");
                    break;
            }
        }
    }
