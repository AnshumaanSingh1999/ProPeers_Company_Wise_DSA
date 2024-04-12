//Accepted
package Arrays;
import java.util.Scanner;
public class square_root {
    public static int sqrtN(long N) {
		double resp=Math.floor(Math.sqrt(N));
		int r=(int) resp;
		return r;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        int resp=sqrtN(x);
        System.out.println(resp);
    }
}