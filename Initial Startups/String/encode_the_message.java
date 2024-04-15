//Partially Accepted
import java.util.Scanner;
class encode_the_message{
    public static String encode(String message) {
        String r="";
        int c=0;
        if(message.length()>1){
            for(int i=1;i<message.length();i++){
                char cur=message.charAt(i);
                char prev=message.charAt(i-1);
                if(i==message.length()-1){
                    if(cur==prev){
                        c=c+2;
                        r=r+prev+c;
                        c=0;
                    }
                    else if(cur!=prev){
                        if(c>0){
                            c=c+1;
                            r=r+prev+c;
                            c=0;
                            r=r+cur+1;
                        }
                        else if(c==0){
                            r=r+prev+1;
                            r=r+cur+1;
                        }
                    }
                }
                else{
                    if(cur==prev){
                        c++;
                    }
                    else if(cur!=prev){
                        if(c>0){
                            c=c+1;
                            r=r+prev+c;
                            c=0;
                        }
                        else if(c==0){
                            r=r+prev+1;
                        }
                    }
                }
            }
        }
        else if(message.length()==1){
            r=r+message.charAt(0)+1;
        }
               
        return r;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String s=sc.nextLine();
            String resp=encode(s);
            System.out.println(resp);
        }
        catch(Exception e){
            System.out.println("Some error happened"+"\n"+e);
        }
    }
}