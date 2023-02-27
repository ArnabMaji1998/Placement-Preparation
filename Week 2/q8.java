import java.util.*;
class q8{
    public static void main(String []args){
        int n,b=0,i;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        if(n<=1){
            System.out.println("the no is not prime");
        }
        for(i=1;i<=n/2;i++){
            if(i%2==0){
               b++; 
            }
        }
        if(b>1){
            System.out.println("the no. is not prime");
        }
        else{
            System.out.println("the no. is prime");
        }
    }
}