import java.util.Scanner;

/**
 * FLOW013
 */
public class FLOW013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a + b + c;
            if (sum == 180)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}