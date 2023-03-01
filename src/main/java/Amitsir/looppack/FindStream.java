package Amitsir.looppack;

import java.util.stream.LongStream;

public class FindStream {
    public static void main(String[] args) {

        long[] data = {1,2,3,4,5,6};

        long toFind = 5;

        boolean found = LongStream.of(data).anyMatch((n -> n == toFind));

        if(found)
            System.out.println(" is Found");
        else
            System.out.println("Not Found..");
    }
}
