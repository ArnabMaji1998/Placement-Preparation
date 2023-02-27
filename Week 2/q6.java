//package codinglab.week2;
import java.util.*;
class q6{
    public static void main(String[] args){
        int a,n,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a != 0)
        {
            n = a % 10;
            sum=n;
            System.out.print(sum);
            a=a/10;
        }
         
    }
}