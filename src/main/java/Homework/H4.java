package Homework;

public class H4 {
    public static void main(String[] args)
    {
        long a,b,c,d;
        a=13234;
        b=43943284;
        c=7242394;
        d=834233323;
        if(a>b)
        {
            if (a > c)
            {
                if (a > d)
                    System.out.println("Big number is A :" + a);
                else
                    System.out.println("Big number is D :" + d);
            }
        }
        else if(b>c)
                {
                    if(b>d)
                        System.out.println("Big number is B :" +b);
                    else
                        System.out.println("Big number is D :" +d);
                }
        else if(c>d)
        {
            System.out.println("Big number is C :" + c);
        }
        else
        {
            System.out.println("Big number is D :" +d);
        }
    }
}



