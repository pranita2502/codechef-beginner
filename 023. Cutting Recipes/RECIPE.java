import java.util.Scanner;

/**
 * RECIPE
 */
public class RECIPE {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int t= sc.nextInt();
         for (int i=0;i<t;i++)
         {
             int n=sc.nextInt();
             int arr[]=new int[n];
             for(int j=0;j<n;j++)
             {
                arr[j]=sc.nextInt();
             }
             for(int j=0;j<n;j++)
             { 
                 System.out.println(arr[j]/n);
             }
         }

    }
}