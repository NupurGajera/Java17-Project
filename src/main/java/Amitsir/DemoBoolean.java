package Amitsir;

public class DemoBoolean {
    public static void main(String[] args) {

        boolean result = true;
        System.out.println(result);
        System.out.println("--------------");
        long a = 10;
        long b = 20;
        System.out.println(a>b);  // returns false because a is lower then b
        System.out.println("--------------");
        double s = 55.55;
        System.out.println(s == 55.55);

        System.out.println("--------------");

        int myAge = 38;
        int votingAge = 18;
        System.out.println(myAge>votingAge);

        boolean london = false;
        System.out.println(london);
    }
}
