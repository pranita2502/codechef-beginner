import java.util.Scanner;

/**
 * FLOW007
 */
public class FLOW007 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int num=sc.nextInt();
            int rev=0;
            while(num!=0)
            {
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            System.out.println(rev);
        }
        sc.close();
    }
}