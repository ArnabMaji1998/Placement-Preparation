import java.util.*;
public class q7{
	public static void main(String [] args){
		int n,p=7,q=10,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(p+" ");
                p++;
            }
            else{
                System.out.print(q+" ");
                q++;
            }
            
        }
		
	}
}