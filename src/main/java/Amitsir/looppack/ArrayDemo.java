package Amitsir.looppack;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        long[] data = {12,44,55,66,77,88,99};

        System.out.println(data[5]);

        Arrays.stream(data).forEach(System.out::println);

    }
}
