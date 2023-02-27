//package codinglab.week2;

import java.util.*;
class q1{
    public static void main(String[] args){
        int a,n,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a != 0)
        {
            n = a % 10;    // 52%10=2
            sum = sum + n; //0+2=2
            a = a / 10;    //52/10=5.2
        }
        System.out.println(sum); 
    }
}