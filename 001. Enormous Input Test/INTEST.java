import java.util.Scanner;

/**
 * INTEST
 */
class INTEST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % k == 0)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}