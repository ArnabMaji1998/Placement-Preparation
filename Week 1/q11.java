import java.util.*;
public class q11{
	public static void main(String [] args){
		int n,i,j,p=14,a=6;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
        
        for(i=1;i<=n;i++){ // i=1, 2, 3, 4, 
            System.out.print(p+" "+(p*2)+" "); // 14 28, 20 40, 32 64, 50 100, 74 148,
            p=p+a; // 14+6=20, 20+12=32, 32+18=50, 50+24=74, 74+30=104,
            a=a+6; // 6+6=12, 12+6=18, 18+6==24,24+6=30, 36
        }
    }
}