import java.util.Scanner;

/**
 * LUCKFOUR
 */
public class LUCKFOUR {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int count=0;
            int num=sc.nextInt();
            while(num!=0)
            {
                int rem=num%10;
                if(rem==4)
                    count++;
                num=num/10;

            }
            System.out.println(count);
        }
        sc.close();
    
    }
}