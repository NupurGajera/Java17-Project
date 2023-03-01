package Amitsir;

public class Bigin3No {
    public static void main(String[] args) {

        long number1,number2,number3,number4;

        number1 = 20;
        number2 = 30;
        number3 = 0;
        number4 = 90;

        if(number1 > number2)
        {
            if(number1 > number3)
            {
                if(number1 > number4)
                {
                    System.out.println("Largest of four numbers is: " + number1);
                }
                else
                {
                    System.out.println("Largest of four numbers is: " + number4);
                }
            }
        }
        else if(number2 > number3)
        {
            if(number2 > number4)
            {
                System.out.println("Largest of four numbers is: " + number2);
            }
            else
            {
                System.out.println("Largest of four numbers is: " + number4);
            }
        }
        else if(number3 > number4)
        {
            System.out.println("Largest of four numbers is: " + number3);
        }
        else
        {
            System.out.println("Largest of four numbers is: " + number4);
        }
    }
}
