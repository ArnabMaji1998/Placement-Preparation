import java.util.*;
class q9{
    public static void main(String[] args) 
    {
        int i,n,j,c=0,sum=0 ;
        // Scanner sc =new Scanner(System.in);
        // n=sc.nextInt();
        for(j=1;j<=10;j++)
        {
            for (i=2;i<=j;i++)
            {
                if(j%i==0)
                {
                    c++;
                }
            }
            if(c==0 && j!=1)
            {
                sum=sum+j;
                //System.out.println("1");
            } 
            
        }
        //sum=sum+j; 
        System.out.println(sum);
    }
}
