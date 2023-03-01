package Amitsir;

import java.util.function.Function;

public class UnaryOps {
    public static void main(String[] args) {

        Function<Integer,Integer> func = x -> x * 2;  // x = 2 * 2

        Integer result = func.apply(2);

        System.out.println(result);
    }
}
