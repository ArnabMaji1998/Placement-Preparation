//14. Write a program to display the sequence A, Z, X, B, V,……………
import java.util.*;
public class q14{
	public static void main(String [] args){
		int n,c=65,d=90,i,j;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++){
            System.out.print((char)c+" ");
            for(j=i+1;j<=i+2;j++){
                System.out.print((char)d+" ");
                d-=2;
            }
            c++;
            i=i+3;
        }
    }
}
