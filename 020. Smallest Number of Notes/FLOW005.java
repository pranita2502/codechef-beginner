import java.util.Scanner;

/**
 * FLOW005
 */
public class FLOW005 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int arr[]={100,50,10,5,2,1};
        for (int j=0;j<t;j++)
        {
            int n= sc.nextInt();
            int count=0;
            for(int i=0;i<arr.length;)
            {
                if(arr[i]>n)
                i++;
                else if(arr[i]<=n)
                {
                    n=n-arr[i];
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}