import java.util.Scanner;

/**
 * FLOW004
 */
class FLOW004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String number = sc.nextLine();
            System.out.println(Character.getNumericValue(number.charAt(0))
                    + Character.getNumericValue(number.charAt(number.length() - 1)));
        }
        sc.close();
    }
}