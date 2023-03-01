package Amitsir.looppack;

import java.util.Arrays;

public class ArraysortedDemo {
    public static void main(String[] args) {

        long[] data = {1,434,55,616,70,88,939};

        System.out.println("Sorting Array..");

        Arrays.stream(data).sorted().forEach(System.out::println);
    }
}
