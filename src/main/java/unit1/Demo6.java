package unit1;

public class Demo6 {
    public static void main(String[] args)
    {
    long a,b,c,d;
    a = 107000;
    b = 4770;
    c = 390;
    d =89;
    if (a>b)
    {
       if (a>c)
    {
        if (a>d)
           System.out.println("Big no is A : " +a);
        else
            System.out.println("Big no is D :" +d);
        }
    }
    else if (b>c)
    {
        if (b>d)
            System.out.println("Big no is B :" +b);
        else
            System.out.println("Big no is D :" +d);
    }
    else if (c>d)
    {
        System.out.println("Big no is C :" +c);
    }
        else
    {
        System.out.println("Big no is D :" +d);
    }
    }
}
