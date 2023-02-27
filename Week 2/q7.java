import java.util.*;
class q7{
    public static void main(String []args){
        int n,a,sum=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int h=n;
        while(n!=0){
            a = n % 10;
            sum=((sum*10)+a);
            //System.out.print(sum+" is palindrome");
            n=n/10;
        }
        if(sum==h){
            System.out.println(sum+" is a palindrome");
        }
        else{
            System.out.println(sum+" is not a palindrome");
        }

    }
}