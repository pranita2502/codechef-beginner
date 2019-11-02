import java.util.Scanner;

/**
 * FLOW006
 */
class FLOW006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int add = 0;
            while (n != 0) {
                int rem = n % 10;
                n = n / 10;
                add = add + rem;
            }
            System.out.println(add);
        }
    }

}