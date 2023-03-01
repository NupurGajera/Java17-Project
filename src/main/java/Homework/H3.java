package Homework;

public class H3
{
    public static void main(String[]args)
    {
        long a,b,c;
        a=3533532;
        b=905837932;
        c=839282682;
        if (a>b)
        {
            if (a > c)
                System.out.println("Big number is A :" + a);
            else
                System.out.println("Big number is C :" + c);
        }
           else if (b>c)
           {
                System.out.println("Big number is B :" + b);
           }
            else
            {
                System.out.println("Big number is C :" + c);
            }
        }
}


