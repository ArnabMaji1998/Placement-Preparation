import java.util.*;
public class q4{
	public static void main(String [] args){
		int n,p=1,q=2,i,a;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
        System.out.println(p+"");
        System.out.println(q+" ");
		for(i=2;i<n;i++){
            a=p*q;
            System.out.println(a+"");
            p=q;
            q=a;
        }    
    }
}