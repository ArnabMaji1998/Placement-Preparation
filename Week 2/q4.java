//15. Write a program to display the sequence BCA1, BCB2, BCC3, BCD4, …………………
import java.util.*;
class q4{
    public static void main(String []args){
        int n,i,a=65,m=66;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            System.out.print((char)a);
            System.out.print((char)m);
            System.out.print((char)a+" ");
            a++;
            m++;
        }
        if(a<90){
            a=65;
        }
        if(m<90){
            m=66;
        }
    }
}