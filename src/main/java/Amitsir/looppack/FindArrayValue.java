package Amitsir.looppack;

public class FindArrayValue {
    public static void main(String[] args) {

        long[] num = {1,2,3,4,5,6};
        long toFind=54;
        boolean found = false;

        for(long s:num){
            if(s == toFind)
            {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(" Is Found");
        else
            System.out.println(" Is not Found ");
    }
}
