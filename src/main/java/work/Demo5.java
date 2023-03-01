package work;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Demo5 {
    public static void main(String[] args) {
        long[] data ={132,3452,5,56,7532,325};
        System.out.println("decending array");
        Arrays.stream(data).sorted().forEach(System.out::println);

    }
}
