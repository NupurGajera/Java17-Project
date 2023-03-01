package Amitsir.looppack;
// WAP to print this pattern

/**
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *
 * 1
 * 22
 * 333
 * 4444
 * 55555
 *
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class LoopPattern {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
