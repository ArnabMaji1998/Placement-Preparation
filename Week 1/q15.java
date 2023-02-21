//15. Write a program to display the sequence BCA1, BCB2, BCC3, BCD4, …………………
import java.util.*;
class q15{
    public static void main(String []args){
        int n,i,b=66,c=67,d=65;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            System.out.print((char)b);
            System.out.print((char)c);
            System.out.print((char)d+" ");
            d++;
        }
    }
}