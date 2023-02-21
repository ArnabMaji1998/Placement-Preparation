import java.util.*;
public class q12{
	public static void main(String [] args){
		int n,c=65,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=n;i++){
            System.out.println((char)c+""+(int)Math.pow(2, i));
            c++;
			
        }
		if(c<90){
			c=65;
		}
    }
}