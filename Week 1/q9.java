import java.util.*;
public class q9{
	public static void main(String [] args){
		int n,p=1,q=1,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(p+" ");
                p+=4;
            }
            else{
                System.out.print(q+" ");
                q+=4;
            }
            
        }
		
	}
}