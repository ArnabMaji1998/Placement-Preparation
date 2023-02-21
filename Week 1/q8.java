import java.util.*;
public class q8{
	public static void main(String [] args){
		int n,i,a=1;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+i;
        }
    }
}