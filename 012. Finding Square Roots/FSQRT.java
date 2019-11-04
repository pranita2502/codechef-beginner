import java.util.Scanner;
import java.lang.Math;

/**
 * FSQRT
 */
public class FSQRT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println((int)Math.sqrt(sc.nextInt()));
        }
        sc.close();
    }
}