import java.util.Scanner;

/* CIELRCPT
*/
public class CIELRCPT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]={2048,1024,512,256,128,64,32,16,8,4,2,1};
        for(int j=0;j<t;j++)
        {
            int count=0;
            int p=sc.nextInt();
            for(int i=0;i<arr.length;)
            {
                if(p<arr[i])
                i++;
                else if(p>=arr[i])
                {
                    p=p-arr[i];
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}