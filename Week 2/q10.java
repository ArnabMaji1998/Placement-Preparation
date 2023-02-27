import java.util.*;
class q10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,d=65;
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
           arr[i] = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print((char)d+""+arr[i]+" ");
            d++;
            if(d>90)
            d=65;
        }
        
    }
}
