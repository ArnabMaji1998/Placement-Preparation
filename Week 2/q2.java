import java.util.*;
class q2{
    public static void main(String [] args){
        int a,i,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i; 
            }   
        }
        System.out.println(sum+": it is a perfect no.");
    }
}