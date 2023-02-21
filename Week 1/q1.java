import java.util.*;
public class q1{
	public static void main(String [] args){
		int n,p=0,q=0,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(p+" ");
                p+=2;
            }
            else{
                System.out.print(q+" ");
                q++;
            }
            
        }
		
	}
}