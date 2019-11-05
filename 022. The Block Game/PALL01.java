import java.util.Scanner;

/**
 * PALL01
 */
public class PALL01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int temp = n;
            int rev = 0;
            while (n > 0) {
                int rem = n % 10;
                rev = (rev * 10) + rem;
                n = n / 10;
            }
            if (rev == temp)
            {
                System.out.println("Winner");
            }
            else
            {
                System.out.println("Losser");
            }
        }
        sc.close();
    }
}