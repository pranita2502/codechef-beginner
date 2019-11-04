import java.util.Scanner;

/**
 * TLG
 */
public class TLG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int t[] = new int[r];
        int s[] = new int[r];
        int lead[] = new int[r];
        int win=0;
        for (int i = 0; i < r; i++) {
            t[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        int max = lead[0];
        for(int i=0;i<r;i++)
        {
            if(t[i]>s[i])
                lead[i] = t[i] - s[i];
            else
                lead[i]=s[i]-t[i];
            if (lead[i] > max) {
                max = lead[i];
                if(t[i]>s[i])
                    win=1;
                else
                    win=2;
            }
        }
        System.out.println(win + " " + max);
        sc.close();
    }
}