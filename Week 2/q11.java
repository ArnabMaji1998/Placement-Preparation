import java.util.*;
class q11{
    public static void main(String[]args){
        int a=12,b=8,gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        System.out.println(gcd);
    }
}
