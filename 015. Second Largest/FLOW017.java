
import java.util.Scanner;

/**
 * FLOW017
 */
public class FLOW017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c =sc.nextInt();

        if((a>b && a<c)||(a<b && a>c))
            System.out.println(a);  
        else if((b>a && b<c) || (b<a && b>c))
        System.out.println(b);
        else
            System.out.println(c);
        }
        sc.close();
    }
}