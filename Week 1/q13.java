//13. Write a program to display the sequence A1, B2, C3, …., Y25,Z26, A1, B2,……………
import java.util.*;
public class q13{
	public static void main(String [] args){
		int n,b=1,c=65,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++){
            System.out.println((char)c+""+(int)b);
            c++;
            b++;
            if(c>90){
                c=65;
            }
            if(b>26){
                b=1;
            }
        }
        
    }
}