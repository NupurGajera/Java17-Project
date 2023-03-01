package Amitsir.looppack;

import java.util.Arrays;
import java.util.OptionalLong;

public class ArraySum {
    public static void main(String[] args) {

        long[] data = {12,44,55,66,77,88,99};

        OptionalLong big = Arrays.stream(data).max();

        System.out.println(big);

        long total = Arrays.stream(data).sum();

        System.out.println(total);
    }
}
