import java.math.BigInteger;
import java.util.Scanner;

/**
 * FCTRL2
 */
class FCTRL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            for (int j = 1; j <= n; j++) 
            {
                fact = fact.multiply(BigInteger.valueOf(j));
            }
            System.out.println(fact);
        }
        sc.close();
    }

}