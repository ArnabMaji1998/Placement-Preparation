import java.util.*;
import java.io.*;
public class q2{
	public static void main(String [] args){
		int i;
		Scanner sc = new Scanner(System.in);
		double a=sc.nextInt(), x;
        double b=sc.nextInt();
        for(i=0;i<=b;i++){
            //System.out.println(Math.pow(a, i));
            x=Math.pow(a, i);
            System.out.println((int)x);
        }

    }
}