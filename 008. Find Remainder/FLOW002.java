import java.util.Scanner;

/**
 * FLOW002
 */
public class FLOW002 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            System.out.println(sc.nextInt()%sc.nextInt());
        }
        sc.close();
    }
}