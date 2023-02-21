import java.util.*;
import java.io.*;
public class q6{
	public static void main(String [] args){
		int i;
		Scanner sc = new Scanner(System.in);
		double a=sc.nextInt(), x;
        double b=sc.nextInt();
        for(i=1;i<=b;i++){
            //System.out.println(Math.pow(a, i));
            x=Math.pow(2, i);
            System.out.println((int)x);
        }

    }
}