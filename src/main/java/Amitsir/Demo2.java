package Amitsir;

public class Demo2 {
    public static void main(String[] args) {
        long a, b, c, d;
        a = 107000;
        b = 476670;
        c = 38787890;
        d = 898989899;
        if (a > b) {
            if (a > c) {
                if (a > d)
                    System.out.println("Big no is a : " + a);
                else
                    System.out.println("Big no is d : " + d);
            }
        } else if (b > c) {
            if (b > d)
                System.out.println("Big no is b : " + b);
            else
                System.out.println("Big no is d :" + d);

        } else
        if (c > d)
            System.out.println("Big no is c : " + c);
        else
            System.out.println("Big no is d : " + d);
    }
}
