package Amitsir;

public class EnumDemo {
    enum Product {
        MAC,
        LENOVO,
        HP,
        IBM,
    }

    public static void main(String[] args) {

        Product p = Product.HP;
        System.out.println(p);
    }
}
