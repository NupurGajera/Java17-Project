package unit1;

public class Demo11 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp;
        System.out.println("Before swap value A :"+a);
        System.out.println("Before swap value B :"+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("value a :"+a);
        System.out.println("value b :"+b);
    }
}
