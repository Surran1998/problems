import java.util.*;
class PrimeNumber{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a,b,i,j,n;
        System.out.println("Enter the value of n");
        n = scan.nextInt();
        b=0;
        i=1;
        System.out.println("The first" + n + "prime no are:");
        while(b<n){
            j=1;
            a=0;
            while(j<=i){
                if(i%j==0)

                a++;
                j++;
                
            }
            
            if(a==2){
                
                System.out.println(i);
                b++;
    
            }
            i++;
        }
        
    }    
}