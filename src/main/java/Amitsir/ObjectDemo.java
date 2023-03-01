package Amitsir;


    class ODemo2
    {
        public void calc()
        {
            int s=10;
            int t=20;
            System.out.println(s+t);
        }
    }
public class ObjectDemo {

        public void getName() {

            System.out.println("ObjectDemo Class");
        }
        public static void main(String[] args) {

            ObjectDemo obd = new ObjectDemo();
            obd.getName();

            ODemo2 od = new ODemo2();
            ODemo2 od1 = new ODemo2();
            od.calc();
            System.out.println("Second Object ...");
            od1.calc();
        }
}
