package unit1;

public class Demo4 {
    public static void main(String[] args)
    {
        long a,b,c;
        a = 10;
        b = 20;
        c = 30;
        if(a>b)
        {
            if (a > c)
                System.out.println("Big is A :" + a);
            else
                System.out.println("Big is C :" + c);
        }
        else
        {
            if (b>c)
                System.out.println("Big is B :" +b);
            else
                System.out.println("Big is C :" +c);
        }
    }
}
