//Project Name:Singarapu Sanjay Kumar

import java.util.*;
public class Program3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int c=(n%2==0)? n-1 :n;
        for(int i=1;i<=c;i+=2)
        {
            System.out.print(i);
            if(i<c)
            {
                System.out.print(", ");
            }
        }
    }
}
    
    
