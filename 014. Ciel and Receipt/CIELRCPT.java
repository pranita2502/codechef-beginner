import java.lang.*;

/* CIELRCPT
*/
public class CIELRCPT {

    static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;

        return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
    }
}