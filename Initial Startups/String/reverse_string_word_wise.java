//Accepted
import java.util.Scanner;
class reversw_string_word_wise{
    static String reverseStringWordWise(String input) {
        String r="";
        String x[]=input.split(" ");
        for(int i=x.length-1;i>=0;i--){
            r=r+x[i]+" ";
        }
        r=r.trim();     
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}